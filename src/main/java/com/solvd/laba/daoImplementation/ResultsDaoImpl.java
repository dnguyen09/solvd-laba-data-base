package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.enums.Medal;
import com.solvd.laba.model.Athlete;
import com.solvd.laba.model.Event;
import com.solvd.laba.model.Result;
import com.solvd.laba.model.Team;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultsDaoImpl extends DAOImpl<Result> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM results";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE results SET medal = ?, event_id = ?, athlete_id = ?, team_id = ? WHERE result_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM results WHERE result_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO results (result_id, medal, event_id, athlete_id, team_id) VALUES (?, ?, ?, ?, ?)";
    }

    @Override
    protected Result createEntity() {
        return new Result();
    }

    @Override
    protected void getResultSet(ResultSet rs, Result result) throws SQLException {
        result.setResultId(rs.getInt("result_id"));
        result.setMedal(Medal.valueOf(rs.getString("medal")));

        // Create Event instance
        Event event = new Event();
        event.setEventId(rs.getInt("event_id"));
        result.setEvent(event);

        // Create Athlete instance
        Athlete athlete = new Athlete();
        athlete.setAthleteId(rs.getInt("athlete_id"));
        result.setAthlete(athlete);

        int teamId = rs.getInt("team_id");
        if (teamId != 0) {
            Team team = new Team();
            team.setTeamId(teamId);
            result.setTeam(team);
        }
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Result result) throws SQLException {
        ps.setString(1, result.getMedal().name());
        ps.setInt(2, result.getEvent().getEventId());
        ps.setInt(3, result.getAthlete().getAthleteId());
        ps.setInt(4, result.getTeam().getTeamId());
        ps.setInt(5, result.getResultId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Result result) throws SQLException {
        ps.setInt(1, result.getResultId());
        ps.setString(2, result.getMedal().name());
        ps.setInt(3, result.getEvent().getEventId());
        ps.setInt(4, result.getAthlete().getAthleteId());
        ps.setInt(5, result.getTeam().getTeamId());
    }
}
