package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.CompetitionsDAO;
import com.solvd.laba.model.Competitions;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompetitionsImpl implements CompetitionsDAO {
    @Override
    public List<Competitions> getAll() {

        //initialize a list of team
        List<Competitions> competitionsList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM competitions");

            //loop through rs
            while (rs.next()) {

                //initialize competition variable to receive values from rs
                Competitions competitions = new Competitions();

                competitions.setEventId(rs.getInt(1));
                competitions.setAthleteId(rs.getInt(2));
                competitions.setTeamId(rs.getInt(3));
                competitions.setEventId(rs.getInt(4));

                //add competition to the list
                competitionsList.add(competitions);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return competitionsList;
    }

    @Override
    public int insert(Competitions competitions) {
        return 0;
    }

}
