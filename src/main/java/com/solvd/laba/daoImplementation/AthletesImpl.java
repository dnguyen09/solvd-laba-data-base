package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.AthletesDAO;
import com.solvd.laba.model.Athletes;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AthletesImpl implements AthletesDAO {
    @Override
    public List<Athletes> getAll() {

        //initialize a list of athlete
        List<Athletes> athletesList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM athletes");

            //loop through rs
            while (rs.next()) {

                //initialize athlete variable to receive values from rs
                Athletes athletes = new Athletes();

                athletes.setAthleteId(rs.getInt(1));
                athletes.setAthleteName(rs.getString(2));
                athletes.setGender(rs.getString(3));
                athletes.setAge(rs.getInt(4));
                athletes.setTeamId(rs.getInt(5));

                //add athlete to the list
                athletesList.add(athletes);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return athletesList;
    }

    @Override
    public int insert(Athletes athletes) {
        return 0;
    }

}
