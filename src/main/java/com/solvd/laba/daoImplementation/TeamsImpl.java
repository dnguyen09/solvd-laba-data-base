package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.TeamsDAO;
import com.solvd.laba.model.Teams;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeamsImpl implements TeamsDAO {
    @Override
    public List<Teams> getAll() {

        //initialize a list of team
        List<Teams> teamsList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM teams");

            //loop through rs
            while (rs.next()) {

                //initialize team variable to receive values from rs
                Teams teams = new Teams();

                teams.setTeamId(rs.getInt(1));
                teams.setTeamName(rs.getString(2));
                teams.setNationId(rs.getInt(3));
                teams.setHotelId(rs.getInt(4));

                //add teams to the list
                teamsList.add(teams);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return teamsList;
    }

    @Override
    public int insert(Teams teams) {
        return 0;
    }
}
