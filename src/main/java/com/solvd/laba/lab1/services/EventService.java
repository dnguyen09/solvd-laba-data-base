package com.solvd.laba.lab1.services;

import com.solvd.laba.lab1.daoImplementation.EventDaoImpl;
import com.solvd.laba.lab1.daoImplementation.TeamDaoImpl;
import com.solvd.laba.lab1.model.Event;
import com.solvd.laba.lab1.model.Team;

import java.util.List;

public class EventService {
    private final TeamDaoImpl teamDao;
    private final EventDaoImpl eventDao;

    public EventService() {
        this.teamDao = new TeamDaoImpl();
        this.eventDao = new EventDaoImpl();
    }

    public Event getTeam(int eventId) {
        List<Team> team = teamDao.getTeamsByEventId(eventId);
        Event event = eventDao.getById(eventId);

        event.setTeams(team);
        return event;
    }

    public static void main(String[] args) {
        System.out.println(new EventService().getTeam(8));
    }
}
