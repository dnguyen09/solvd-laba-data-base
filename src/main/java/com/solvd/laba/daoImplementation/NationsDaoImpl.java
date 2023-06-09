package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.model.Nation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NationsDaoImpl extends DAOImpl<Nation> {

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
    protected Nation createEntity() {
        return new Nation();
    }

    @Override
    protected void getResultSet(ResultSet rs, Nation nation) throws SQLException {
        nation.setNationId(rs.getInt(1));
        nation.setNationName(rs.getString(2));
        nation.setRegion(rs.getString(3));
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
