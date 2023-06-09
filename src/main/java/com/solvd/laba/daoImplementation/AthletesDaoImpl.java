package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.daoInterfaces.AthletesDAO;
import com.solvd.laba.model.Athlete;
import com.solvd.laba.model.Team;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AthletesDaoImpl extends DAOImpl<Athlete> implements AthletesDAO {

    @Override
    protected void getResultSet(ResultSet rs, Athlete athlete) throws SQLException {
        athlete.setAthleteId(rs.getInt(1));
        athlete.setAthleteName(rs.getString(2));
        athlete.setGender(rs.getString(3));
        athlete.setAge(rs.getInt(4));

        //create Team object and set its properties
        Team team = new Team();
        team.setTeamId(rs.getInt("team_id"));

        // Set the Team object in the Athlete object
        athlete.setTeam(team);
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Athlete athlete) throws SQLException {
        ps.setString(1, athlete.getAthleteName());
        ps.setInt(2, athlete.getAthleteId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Athlete athlete) throws SQLException {
        ps.setInt(1, athlete.getAthleteId());
        ps.setString(2, athlete.getAthleteName());
        ps.setString(3, athlete.getGender());
        ps.setInt(4, athlete.getAge());
        ps.setInt(5, athlete.getTeam().getTeamId());
    }

    @Override
    protected String getSQL() {
        return "SELECT * FROM athletes";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE athletes SET athlete_name = ? WHERE athlete_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return "DELETE FROM athletes WHERE athlete_id = ?";
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM athletes  WHERE athlete_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO athletes (athlete_id, athlete_name, gender, age, team_id) VALUES (?, ?, ?, ?, ?) ";
    }

    @Override
    protected Athlete createEntity() {
        return new Athlete();
    }

    @Override
    public List<Athlete> getAthleteByTeamId(int teamId) {

        List<Athlete> list = new ArrayList<>();

        //establish database connection and preparedStatement
        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM athletes WHERE team_id = ?")) {

            //adding value to ps
            ps.setInt(1, teamId);

            //initialize resultSet
            ResultSet rs = ps.executeQuery();

            //loop through rs
            while (rs.next()) {
                Athlete ath = new Athlete();
                getResultSet(rs, ath);
                list.add(ath);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
