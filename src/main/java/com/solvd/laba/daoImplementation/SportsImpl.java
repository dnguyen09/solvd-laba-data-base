package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.SportsDAO;
import com.solvd.laba.model.Sports;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SportsImpl implements SportsDAO {
    @Override
    public List<Sports> getAll() {

        //initialize a list of nation
        List<Sports> sportsList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM sports");

            //loop through rs
            while (rs.next()) {

                //initialize sports variable to receive values from rs
                Sports sports = new Sports();

                sports.setSportId(rs.getInt(1));
                sports.setSportName(rs.getString(2));

                //add sport to the list
                sportsList.add(sports);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sportsList;
    }

    @Override
    public int insert(Sports sports) {
        return 0;
    }
}
