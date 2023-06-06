package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.HostCountryDAO;
import com.solvd.laba.model.HostCountry;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class HostCountryImpl implements HostCountryDAO {
    @Override
    public List<HostCountry> getAll() {
        //initialize a list of host country
        List<HostCountry> hostCountryList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM host_country");

            //loop through rs
            while (rs.next()) {

                //initialize hostCountry variable to receive values from rs
                HostCountry hostCountry = new HostCountry();

                hostCountry.setHostCountryId(rs.getInt(1));
                hostCountry.setCountryName(rs.getString(2));
                hostCountry.setContinent(rs.getString(3));
                hostCountry.setCapitalCity(rs.getString(4));
                hostCountry.setYearOfHost(Year.of(rs.getInt(5)));
                hostCountry.setIocId(rs.getInt(6));

                //add hostCountry to the list
                hostCountryList.add(hostCountry);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hostCountryList;
    }

    @Override
    public int insert(HostCountry hostCountry) {
        return 0;
    }

}
