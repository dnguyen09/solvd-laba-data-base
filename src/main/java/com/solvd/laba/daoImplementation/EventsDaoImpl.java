package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.model.Event;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventsDaoImpl extends DAOImpl<Event> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM events";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE events SET event_name = ?, start_date = ?, end_date = ?, sport_id = ?, location_id = ? WHERE event_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM events WHERE event_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO events (event_id, event_name, start_date, end_date, sport_id, location_id) VALUES (?, ?, ?, ?, ?, ?)";
    }

    @Override
    protected Event createEntity() {
        return null;
    }

    @Override
    protected void getResultSet(ResultSet rs, Event event) throws SQLException {
        event.setEventId(rs.getInt("event_id"));
        event.setEventName(rs.getString("event_name"));
        event.setStartDate(rs.getDate("start_date").toLocalDate());
        event.setEndDate(rs.getDate("end_date").toLocalDate());

        
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Event entity) throws SQLException {

    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Event entity) throws SQLException {

    }
}
