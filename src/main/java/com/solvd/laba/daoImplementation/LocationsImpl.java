package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.LocationsDAO;
import com.solvd.laba.model.Locations;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LocationsImpl implements LocationsDAO {
    @Override
    public List<Locations> getAll() {
        //initialize a list of locations
        List<Locations> locationsList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM locations");

            //loop through rs
            while (rs.next()) {

                //initialize location variable to receive values from rs
                Locations locations = new Locations();

                locations.setLocationId(rs.getInt(1));
                locations.setLocationName(rs.getString(2));

                int capacity = rs.getInt(3);
                if (rs.wasNull()) {
                    locations.setCapacity(null);
                } else {
                    locations.setCapacity(capacity);
                }

                locations.setCityId(rs.getInt(4));

                //add locations to the list
                locationsList.add(locations);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return locationsList;
    }

    @Override
    public int insert(Locations locations) {
        return 0;
    }

}
