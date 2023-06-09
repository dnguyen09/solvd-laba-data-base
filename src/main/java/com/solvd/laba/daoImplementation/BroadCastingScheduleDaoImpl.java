package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.model.BroadCastingSchedule;
import com.solvd.laba.model.Event;

import java.sql.*;

public class BroadCastingScheduleDaoImpl extends DAOImpl<BroadCastingSchedule> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM broadcasting_schedule";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE broadcasting_schedule SET channel = ?, broadcast_date = ?, start_time = ?, end_time = ?, event_id = ? WHERE broadcast_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM broadcasting_schedule WHERE broadcast_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO broadcasting_schedule (broadcast_id, channel, broadcast_date, start_time, end_time, event_id) VALUES (?, ?, ?, ?, ?, ?)";
    }

    @Override
    protected BroadCastingSchedule createEntity() {
        return new BroadCastingSchedule();
    }

    @Override
    protected void getResultSet(ResultSet rs, BroadCastingSchedule schedule) throws SQLException {
        schedule.setBroadCastId(rs.getInt("broadcast_id"));
        schedule.setChannel(rs.getString("channel"));
        schedule.setBroadCastDate(rs.getDate("broadcast_date").toLocalDate());
        schedule.setStartTime(rs.getTime("start_time").toLocalTime());
        schedule.setEndTime(rs.getTime("end_time").toLocalTime());

        // Create Event instance
        Event event = new Event();
        event.setEventId(rs.getInt("event_id"));
        schedule.setEvent(event);
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, BroadCastingSchedule schedule) throws SQLException {
        ps.setString(1, schedule.getChannel());
        ps.setDate(2, Date.valueOf(schedule.getBroadCastDate()));
        ps.setTime(3, Time.valueOf(schedule.getStartTime()));
        ps.setTime(4, Time.valueOf(schedule.getEndTime()));
        ps.setInt(5, schedule.getEvent().getEventId());
        ps.setInt(6, schedule.getBroadCastId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, BroadCastingSchedule schedule) throws SQLException {
        ps.setInt(1, schedule.getBroadCastId());
        ps.setString(2, schedule.getChannel());
        ps.setDate(3, Date.valueOf(schedule.getBroadCastDate()));
        ps.setTime(4, Time.valueOf(schedule.getStartTime()));
        ps.setTime(5, Time.valueOf(schedule.getEndTime()));
        ps.setInt(6, schedule.getEvent().getEventId());
    }
}
