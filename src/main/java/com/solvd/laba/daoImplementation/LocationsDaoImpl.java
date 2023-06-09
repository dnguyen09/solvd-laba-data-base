package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.model.City;
import com.solvd.laba.model.Location;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LocationsDaoImpl extends DAOImpl<Location> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM locations";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE locations SET location_name = ?, capacity = ? WHERE location_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM locations WHERE location_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO locations (location_id, location_name, capacity, city_id) VALUES (?, ?, ?, ?)";
    }

    @Override
    protected Location createEntity() {
        return new Location();
    }

    @Override
    protected void getResultSet(ResultSet rs, Location location) throws SQLException {
        location.setLocationId(rs.getInt("location_id"));
        location.setLocationName(rs.getString("location_name"));
        location.setCapacity(rs.getInt("capacity"));

        // Create City instance
        City city = new City();
        city.setCityId(rs.getInt("city_id"));
        location.setCity(city);
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Location location) throws SQLException {
        ps.setInt(1, location.getLocationId());
        ps.setString(2, location.getLocationName());
        ps.setInt(3, location.getCapacity());
        ps.setInt(4, location.getCity().getCityId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Location location) throws SQLException {
        ps.setString(1, location.getLocationName());
        ps.setInt(2, location.getCapacity());
        ps.setInt(3, location.getLocationId());
    }
}
