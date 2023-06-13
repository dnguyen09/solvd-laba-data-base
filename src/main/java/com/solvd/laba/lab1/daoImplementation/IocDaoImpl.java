package com.solvd.laba.lab1.daoImplementation;


import com.solvd.laba.lab1.model.InternationalOlympicCommitee;
import com.solvd.laba.lab1.daoInterfaces.IocDao;
import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IocDaoImpl extends DAOImpl<InternationalOlympicCommitee> implements IocDao {

    @Override
    protected String getSQL() {
        return "SELECT * FROM international_olympic_commitee";
    }

    @Override
    protected String getUpdateSQL() {
        return null;
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM international_olympic_commitee  WHERE IOC_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return null;
    }

    @Override
    protected InternationalOlympicCommitee buildFromResultSet(ResultSet rs) throws SQLException {
        InternationalOlympicCommitee ioc = new InternationalOlympicCommitee();
        ioc.setIocId(rs.getInt("IOC_id"));
        ioc.setIocName(rs.getString("IOC_name"));
        ioc.setPresident(rs.getString("president"));
        ioc.setHeadQuater(rs.getString("headquarter"));
        ioc.setYearEstablished(rs.getInt("year_established"));
        return ioc;
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, InternationalOlympicCommitee ioc) throws SQLException {

    }

    @Override
    protected void getInsertPS(PreparedStatement ps, InternationalOlympicCommitee entity) throws SQLException {

    }

    @Override
    public InternationalOlympicCommitee getByHostCountryId(int hostCountryId) {
        InternationalOlympicCommitee ioc = new InternationalOlympicCommitee();

        //establish database connection and preparedStatement
        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT IOC_id FROM host_country WHERE host_country_id = ?")) {

            //adding value to ps
            ps.setInt(1, hostCountryId);

            //initialize resultSet
            ResultSet rs = ps.executeQuery();

            //loop through rs
            while (rs.next()) {
                ioc = buildFromResultSet(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ioc;
    }
}
