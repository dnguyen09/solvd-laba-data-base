package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.model.City;
import com.solvd.laba.model.HostCountry;

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
    protected City createEntity() {
        return new City();
    }

    @Override
    protected void getResultSet(ResultSet rs, City city) throws SQLException {
        city.setCityId(rs.getInt(1));
        city.setCityName(rs.getString(2));

        //create instance of HostCountry
        HostCountry hc = new HostCountry();
        hc.setHostCountryId(rs.getInt(3));
        city.setHostCountry(hc);
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
