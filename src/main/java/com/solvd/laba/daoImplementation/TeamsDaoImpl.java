package com.solvd.laba.daoImplementation;

import com.solvd.laba.dao.DAOImpl;
import com.solvd.laba.daoInterfaces.TeamsDAO;
import com.solvd.laba.model.Hotel;
import com.solvd.laba.model.Nation;
import com.solvd.laba.model.Team;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamsDaoImpl extends DAOImpl<Team> implements TeamsDAO {

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
    protected Team createEntity() {
        return new Team();
    }

    @Override
    protected void getResultSet(ResultSet rs, Team team) throws SQLException {
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
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Team entity) throws SQLException {

    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Team entity) throws SQLException {

    }

    @Override
    public List<Team> getTeamByNationId(int nationId) {

        List<Team> list = new ArrayList<>();

        //establish database connection and preparedStatement
        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM teams WHERE nation_id = ?")) {

            //adding value to ps
            ps.setInt(1, nationId);

            //initialize resultSet
            ResultSet rs = ps.executeQuery();

            //loop through rs
            while (rs.next()) {
                Team team = new Team();
                getResultSet(rs, team);
                list.add(team);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
