package com.solvd.laba.lab1.daoImplementation;

import com.solvd.laba.lab1.model.HostCountry;
import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.model.City;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityDaoImpl extends DAOImpl<City> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM cities";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE cities SET city_name = ? WHERE city_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM cities WHERE city_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO cities (city_id, city_name, host_country_id) VALUES (?, ?, ?)";
    }

    @Override
    protected City buildFromResultSet(ResultSet rs) throws SQLException {
        City city = new City();
        city.setCityId(rs.getInt(1));
        city.setCityName(rs.getString(2));

        //create instance of HostCountry
        HostCountry hc = new HostCountry();
        hc.setHostCountryId(rs.getInt(3));
        city.setHostCountry(hc);
        return city;
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, City city) throws SQLException {
        ps.setString(1, city.getCityName());
        ps.setInt(2, city.getCityId());

    }

    @Override
    protected void getInsertPS(PreparedStatement ps, City city) throws SQLException {
        ps.setInt(1, city.getCityId());
        ps.setString(2, city.getCityName());
        ps.setInt(3, city.getHostCountry().getHostCountryId());
    }
}
