package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.CitiesDAO;
import com.solvd.laba.model.Cities;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CitiesImpl implements CitiesDAO {
    @Override
    public List<Cities> getAll() {
        //initialize a list of cities
        List<Cities> citiesList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM cities");

            //loop through rs
            while (rs.next()) {

                //initialize cities variable to receive values from rs
                Cities cities = new Cities();

                cities.setCityId(rs.getInt("city_id"));
                cities.setCityName(rs.getString("city_name"));
                cities.setHostCountryId(rs.getInt("host_country_id"));

                //add cities to the list
                citiesList.add(cities);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citiesList;
    }

    @Override
    public int insert(Cities cities) {
        //initialize sql query
        String sql = "INSERT INTO cities (city_id, city_name, host_country_id)" +
                "VALUES (?, ?, ?)";

        int result = 0;

        //establish database connection and preparedStatement
        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            //adding values to ps
            ps.setInt(1, cities.getCityId());
            ps.setString(2, cities.getCityName());
            ps.setInt(3, cities.getHostCountryId());

            //return executeUpdate row count for SQL
            result = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        CitiesDAO da = new CitiesImpl();
        Cities ct = new Cities(11, "Liverpool", 1);

        int result = da.insert(ct);

        System.out.println(result);
    }
}
