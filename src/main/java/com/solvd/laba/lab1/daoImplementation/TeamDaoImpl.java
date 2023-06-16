package com.solvd.laba.lab1.daoImplementation;

import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.daoInterfaces.TeamDao;
import com.solvd.laba.lab1.model.Hotel;
import com.solvd.laba.lab1.model.Nation;
import com.solvd.laba.lab1.model.Team;

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
        team.setTeamId(rs.getInt(1));
        team.setTeamName(rs.getString(2));

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
    public List<Team> getByTeamId(int teamId) {
//        List<Team> list = new ArrayList<>();
//
//        //establish database connection and preparedStatement
//        try (Connection con = ConnectionUtil.getConnection();
//             PreparedStatement ps = con.prepareStatement("SELECT * FROM teams WHERE team_id = ?")) {
//
//            //adding value to ps
//            ps.setInt(1, teamId);
//
//            //initialize resultSet
//            ResultSet rs = ps.executeQuery();
//
//            //loop through rs
//            while (rs.next()) {
//                list.add(buildFromResultSet(rs));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
        return null;
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

