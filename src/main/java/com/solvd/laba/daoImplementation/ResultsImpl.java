package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.ResultsDAO;
import com.solvd.laba.model.Results;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ResultsImpl implements ResultsDAO {
    @Override
    public List<Results> getAll() {

        //initialize a list of result
        List<Results> resultsList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM results");

            //loop through rs
            while (rs.next()) {

                //initialize result variable to receive values from rs
                Results results = new Results();

                results.setResultId(rs.getInt(1));
                results.setMedal(rs.getString(2));
                results.setEventId(rs.getInt(3));
                results.setAthleteId(rs.getInt(4));
                results.setTeamId(rs.getInt(5));

                //add result to the list
                resultsList.add(results);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultsList;

    }

    @Override
    public int insert(Results results) {
        return 0;
    }
}
