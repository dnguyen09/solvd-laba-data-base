package com.solvd.laba.lab1.daoImplementation;

import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.daoInterfaces.TeamDao;
import com.solvd.laba.lab1.model.Hotel;
import com.solvd.laba.lab1.model.Nation;
import com.solvd.laba.lab1.model.Team;
import com.solvd.laba.lab1.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TeamDaoImpl extends DAOImpl<Team> implements TeamDao {

    @Override
    protected String getSQL() {
        return "SELECT * FROM teams";
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
        return "SELECT * FROM teams WHERE team_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return null;
    }

    @Override
    protected Team buildFromResultSet(ResultSet rs) throws SQLException {
        Team team = new Team();
        team.setTeamId(rs.getInt("team_id"));
        team.setTeamName(rs.getString("team_name"));

        //create nation instance and set its properties
        Nation nation = new Nation();
        nation.setNationId(rs.getInt("nation_id"));

        //create hotel instance and set its properties
        Hotel hotel = new Hotel();
        hotel.setHotelId(rs.getInt("hotel_id"));

        //add to team
        team.setNation(nation);
        team.setHotel(hotel);

        return team;
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Team entity) throws SQLException {

    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Team entity) throws SQLException {

    }

    @Override
    public Team getTeamByAthleteId(int athleteId) {
        Team team = new Team();
        Connection con = null;
        try {
            con = ConnectionUtil.getConnection();

            try (PreparedStatement statement = con.prepareStatement("select * from athletes a\n" +
                    "join teams t on a.team_id = t.team_id\n" +
                    "where a.athlete_id = ?")) {
                statement.setInt(1, athleteId);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    team = buildFromResultSet(rs);
                }
            }
        } catch (InterruptedException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                ConnectionUtil.releaseConnection(con);
            }
        }

        return team;
    }

    @Override
    public List<Team> getTeamsByEventId(int eventId) {
//        List<Team> teams = new ArrayList<>();
//
//        try (Connection connection = ConnectionUtil.getConnection();
//             PreparedStatement statement = connection.prepareStatement(
//                     "SELECT * FROM teams " +
//                             "INNER JOIN events_teams ON teams.team_id = events_teams.team_id " +
//                             "WHERE events_teams.event_id = ?")) {
//
//            statement.setInt(1, eventId);
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                teams.add(buildFromResultSet(resultSet));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return teams;
        return null;
    }
}

