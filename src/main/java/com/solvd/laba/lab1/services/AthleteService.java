package com.solvd.laba.lab1.services;

import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab1.daoImplementation.AthleteDaoImpl;
import com.solvd.laba.lab1.daoImplementation.TeamDaoImpl;
import com.solvd.laba.lab1.model.Team;

public class AthleteService {
    private final AthleteDaoImpl athleteDao;
    private final TeamDaoImpl teamDao;

    public AthleteService() {
        this.athleteDao = new AthleteDaoImpl();
        this.teamDao = new TeamDaoImpl();
    }

    public void createAthlete(int athleteId, String athleteName, String gender, int age, int teamId) {
        Team team = teamDao.getById(teamId);
        Athlete athlete = new Athlete(athleteId, athleteName, gender, age, team);
        athleteDao.insert(athlete);
    }
}

