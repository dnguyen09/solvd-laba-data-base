package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.BroadCastingScheduleDAO;
import com.solvd.laba.model.BroadCastingSchedule;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BroadCastingScheduleImpl implements BroadCastingScheduleDAO {

    @Override
    public List<BroadCastingSchedule> getAll() {

        //initialize a list of broadCast
        List<BroadCastingSchedule> broadCastingList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM broadcasting_schedule");

            //loop through rs
            while (rs.next()) {

                //initialize broadcast variable to receive values from rs
                BroadCastingSchedule broadCast = new BroadCastingSchedule();

                broadCast.setBroadCastId(rs.getInt(1));
                broadCast.setChannel(rs.getString(2));
                broadCast.setBroadCastDate(rs.getDate(3).toLocalDate());
                broadCast.setStartTime(rs.getTime(4).toLocalTime());
                broadCast.setEndTime(rs.getTime(5).toLocalTime());
                broadCast.setEventId(rs.getInt(6));

                //add broadCast to the list
                broadCastingList.add(broadCast);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return broadCastingList;
    }

    @Override
    public int insert(BroadCastingSchedule broadCastingSchedule) {
        return 0;
    }
}
