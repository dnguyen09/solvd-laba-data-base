package com.solvd.laba.lab1.daoImplementation;

import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.daoInterfaces.AthleteDao;
import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab1.model.Team;
import com.solvd.laba.lab1.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AthleteDaoImpl extends DAOImpl<Athlete> implements AthleteDao {

    @Override
    protected Athlete buildFromResultSet(ResultSet rs) throws SQLException {
        Athlete athlete = new Athlete();
        athlete.setAthleteId(rs.getInt(1));
        athlete.setAthleteName(rs.getString(2));
        athlete.setGender(rs.getString(3));
        athlete.setAge(rs.getInt(4));

        //create Team object and set its properties
        Team team = new Team();
        team.setTeamId(rs.getInt(5));

        // Set the Team object in the Athlete object
        athlete.setTeam(team);
        return athlete;
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
    public List<Athlete> getByTeamId(int teamId) {

        List<Athlete> list = new ArrayList<>();

        //establish database connection and preparedStatement
        Connection con = null;
        try {
            con = ConnectionUtil.getConnection();
            try (PreparedStatement ps = con.prepareStatement("SELECT * FROM athletes WHERE team_id = ?")) {

                //adding value to ps
                ps.setInt(1, teamId);

                //initialize resultSet
                ResultSet rs = ps.executeQuery();

                //loop through rs
                while (rs.next()) {

                    list.add(buildFromResultSet(rs));
                }
            }

        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                ConnectionUtil.releaseConnection(con);
            }
        }
        return list;
    }
}
