package com.solvd.laba.lab1.daoImplementation;

import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.model.Sport;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SportDaoImpl extends DAOImpl<Sport> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM sports";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE sports SET sport_name = ? WHERE sport_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM sports WHERE sport_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO sports (sport_id, sport_name) VALUES (?, ?)";
    }

    @Override
    protected Sport buildFromResultSet(ResultSet rs) throws SQLException {
        Sport sport = new Sport();
        sport.setSportId(rs.getInt("sport_id"));
        sport.setSportName(rs.getString("sport_name"));
        return sport;
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Sport sport) throws SQLException {
        ps.setString(1, sport.getSportName());
        ps.setInt(2, sport.getSportId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Sport sport) throws SQLException {
        ps.setInt(1, sport.getSportId());
        ps.setString(2, sport.getSportName());
    }
}
