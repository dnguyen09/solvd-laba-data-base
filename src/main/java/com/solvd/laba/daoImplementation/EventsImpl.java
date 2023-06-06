package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.EventsDAO;
import com.solvd.laba.model.Events;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EventsImpl implements EventsDAO {
    @Override
    public List<Events> getAll() {
        //initialize a list of events
        List<Events> eventsList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM events");

            //loop through rs
            while (rs.next()) {

                //initialize event variable to receive values from rs
                Events events = new Events();

                events.setEventId(rs.getInt(1));
                events.setEvenName(rs.getString(2));
                events.setStartDate(rs.getDate(3).toLocalDate());
                events.setEndDate(rs.getDate(4).toLocalDate());
                events.setSportId(rs.getInt(5));
                events.setLocationId(rs.getInt(6));

                //add event to the list
                eventsList.add(events);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eventsList;
    }

    @Override
    public int insert(Events events) {
        return 0;
    }

}
