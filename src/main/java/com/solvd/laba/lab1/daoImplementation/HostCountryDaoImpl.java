package com.solvd.laba.lab1.daoImplementation;


import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.model.HostCountry;
import com.solvd.laba.lab1.model.InternationalOlympicCommitee;

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
    protected HostCountry buildFromResultSet(ResultSet rs) throws SQLException {
        HostCountry hc = new HostCountry();
        hc.setHostCountryId(rs.getInt("host_country_id"));
        hc.setCountryName(rs.getString("country_name"));
        hc.setContinent(rs.getString("continent"));
        hc.setCapitalCity(rs.getString("capital_city"));
        hc.setYearOfHost(Year.of(rs.getInt("year_of_host")));

        //create an instance of IOC
        InternationalOlympicCommitee ioc = new InternationalOlympicCommitee();
        ioc.setIocId(rs.getInt(rs.getInt("IOC_id")));

        //set the populated IOC to the host country
        hc.setIoc(ioc);
        return hc;
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

    public HostCountry getByIocId(int iocId) {
//        HostCountry hc = new HostCountry();
//
//        //establish database connection and preparedStatement
//        try (Connection con = ConnectionUtil.getConnection();
//             PreparedStatement ps = con.prepareStatement("SELECT country_name, IOC_id FROM host_country WHERE IOC_id = ?")) {
//
//            //adding value to ps
//            ps.setInt(1, iocId);
//
//            //initialize resultSet
//            ResultSet rs = ps.executeQuery();
//
//            //loop through rs
//            while (rs.next()) {
//                hc.setCountryName(rs.getString("country_name"));
//                InternationalOlympicCommitee ioc = new InternationalOlympicCommitee();
//                ioc.setIocId(rs.getInt("IOC_id"));
//                hc.setIoc(ioc);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return hc;
        return null;
    }
}
