package com.solvd.laba.daoImplementation;


import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.model.HostCountry;
import com.solvd.laba.services.HostCountryService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;

public class HostCountryDaoImpl extends DAOImpl<HostCountry> {
    @Override
    protected String getSQL() {
        return "SELECT * FROM host_country";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE host_country SET country_name = ? WHERE host_country_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM host_country WHERE host_country_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO host_country VALUES (?, ?, ?, ?, ?, ?)";
    }

    @Override
    protected HostCountry createEntity() {
        return new HostCountry();
    }

    @Override
    protected void getResultSet(ResultSet rs, HostCountry hc) throws SQLException {
        hc.setHostCountryId(rs.getInt("host_country_id"));
        hc.setCountryName(rs.getString("country_name"));
        hc.setContinent(rs.getString("continent"));
        hc.setCapitalCity(rs.getString("capital_city"));
        hc.setYearOfHost(Year.of(rs.getInt("year_of_host")));

        //create an instance of HostCountryService
        HostCountryService hostCountryService = new HostCountryService();

        //retrieve the populated HostCountry object
        HostCountry populatedHostCountry = hostCountryService.getHostCountry(hc.getHostCountryId());

        //set the populated IOC to the host country
        hc.setIoc(populatedHostCountry.getIoc());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, HostCountry hc) throws SQLException {
        ps.setInt(1, hc.getHostCountryId());
        ps.setString(2, hc.getCountryName());
        ps.setString(4, hc.getContinent());
        ps.setString(4, hc.getCapitalCity());
        ps.setInt(5, (hc.getYearOfHost().getValue()));
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, HostCountry hc) throws SQLException {
        ps.setString(1, hc.getCountryName());
        ps.setInt(2, hc.getHostCountryId());
    }
}
