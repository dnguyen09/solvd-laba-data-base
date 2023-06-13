package com.solvd.laba.lab1.daoImplementation;

import com.solvd.laba.lab1.model.Sport;
import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.model.Event;
import com.solvd.laba.lab1.model.Location;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventDaoImpl extends DAOImpl<Event> {

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
        return "DELETE FROM events WHERE event_id = ?";
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
    protected Event buildFromResultSet(ResultSet rs) throws SQLException {
        Event event = new Event();
        event.setEventId(rs.getInt("event_id"));
        event.setEventName(rs.getString("event_name"));
        event.setStartDate(rs.getDate("start_date").toLocalDate());
        event.setEndDate(rs.getDate("end_date").toLocalDate());

        Sport sport = new Sport();
        sport.setSportId(rs.getInt("sport_id"));
        event.setSport(sport);

        Location location = new Location();
        location.setLocationId(rs.getInt("location_id"));
        event.setLocation(location);
        return event;
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Event event) throws SQLException {
        ps.setString(1, event.getEventName());
        ps.setDate(2, Date.valueOf(event.getStartDate()));
        ps.setDate(3, Date.valueOf(event.getEndDate()));
        ps.setInt(4, event.getSport().getSportId());
        ps.setInt(5, event.getLocation().getLocationId());
        ps.setInt(6, event.getEventId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Event event) throws SQLException {
        ps.setInt(1, event.getEventId());
        ps.setString(2, event.getEventName());
        ps.setDate(3, Date.valueOf(event.getStartDate()));
        ps.setDate(4, Date.valueOf(event.getEndDate()));
        ps.setInt(5, event.getSport().getSportId());
        ps.setInt(6, event.getLocation().getLocationId());
    }

}
