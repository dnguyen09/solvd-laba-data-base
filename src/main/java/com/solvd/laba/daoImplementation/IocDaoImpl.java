package com.solvd.laba.daoImplementation;


import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.model.InternationalOlympicCommitee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IocDaoImpl extends DAOImpl<InternationalOlympicCommitee> {

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
        return null;
    }

    @Override
    protected String getInsertSQL() {
        return null;
    }

    @Override
    protected InternationalOlympicCommitee createEntity() {
        return null;
    }

    @Override
    protected void getResultSet(ResultSet rs, InternationalOlympicCommitee ioc) throws SQLException {
        ioc.setIocId(rs.getInt("IOC_id"));
        ioc.setIocName(rs.getString("IOC_name"));
        ioc.setPresident(rs.getString("president"));
        ioc.setHeadQuater(rs.getString("headquarter"));
        ioc.setYear_established(rs.getInt("year_established"));

    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, InternationalOlympicCommitee ioc) throws SQLException {

    }

    @Override
    protected void getInsertPS(PreparedStatement ps, InternationalOlympicCommitee entity) throws SQLException {

    }
}
