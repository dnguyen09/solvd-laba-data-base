package com.solvd.laba.lab1.daoImplementation;

import com.solvd.laba.lab1.model.Nation;
import com.solvd.laba.lab1.dao.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NationDaoImpl extends DAOImpl<Nation> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM nations";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE nations SET nation_name = ? WHERE nation_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM nations WHERE nation_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return null;
    }

    @Override
    protected Nation buildFromResultSet(ResultSet rs) throws SQLException {
        Nation nation = new Nation();
        nation.setNationId(rs.getInt(1));
        nation.setNationName(rs.getString(2));
        nation.setRegion(rs.getString(3));
        return nation;
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Nation nation) throws SQLException {
        ps.setString(1, nation.getNationName());
        ps.setInt(2, nation.getNationId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Nation entity) throws SQLException {

    }
}
