package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.HotelsDAO;
import com.solvd.laba.model.Hotels;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HotelsImpl implements HotelsDAO {

    @Override
    public List<Hotels> getAll() {
        //initialize a list of hotel
        List<Hotels> hotelsList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM hotels");

            //loop through rs
            while (rs.next()) {

                //initialize hotels variable to receive values from rs
                Hotels hotels = new Hotels();

                hotels.setHotelId(rs.getInt(1));
                hotels.setHotelName(rs.getString(2));
                hotels.setCityId(rs.getInt(3));

                //add ioc to the list
                hotelsList.add(hotels);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hotelsList;
    }

    @Override
    public int insert(Hotels hotels) {
        return 0;
    }
}
