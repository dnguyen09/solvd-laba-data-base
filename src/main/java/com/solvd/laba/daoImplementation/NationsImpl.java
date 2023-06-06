package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.NationsDAO;
import com.solvd.laba.model.Nations;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NationsImpl implements NationsDAO {
    @Override
    public List<Nations> getAll() {

        //initialize a list of nation
        List<Nations> nationsList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM nations");

            //loop through rs
            while (rs.next()) {

                //initialize nation variable to receive values from rs
                Nations nations = new Nations();

                nations.setNationId(rs.getInt(1));
                nations.setNationName(rs.getString(2));
                nations.setRegion(rs.getString(3));

                //add nations to the list
                nationsList.add(nations);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nationsList;
    }

    @Override
    public int insert(Nations nations) {
        return 0;
    }

}
