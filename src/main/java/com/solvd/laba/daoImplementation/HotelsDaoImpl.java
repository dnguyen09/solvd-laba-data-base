package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.model.City;
import com.solvd.laba.model.Hotel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HotelsDaoImpl extends DAOImpl<Hotel> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM hotels";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE hotels SET hotel_name = ?, city_id = ? WHERE hotel_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM hotels WHERE hotel_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO hotels (hotel_id, hotel_name, city_id) VALUES (?, ?, ?)";
    }

    @Override
    protected Hotel createEntity() {
        return new Hotel();
    }

    @Override
    protected void getResultSet(ResultSet rs, Hotel hotel) throws SQLException {
        hotel.setHotelId(rs.getInt(1));
        hotel.setHotelName(rs.getString(2));

        //create instance of city
        City city = new City();
        city.setCityId(rs.getInt("city_id"));
        hotel.setCity(city);
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Hotel hotel) throws SQLException {
        ps.setString(1, hotel.getHotelName());
        ps.setInt(2, hotel.getCity().getCityId());
        ps.setInt(3, hotel.getHotelId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Hotel hotel) throws SQLException {
        ps.setInt(1, hotel.getHotelId());
        ps.setString(2, hotel.getHotelName());
        ps.setInt(3, hotel.getCity().getCityId());
    }
}
