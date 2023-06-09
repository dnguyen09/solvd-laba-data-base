package com.solvd.laba.services;

import com.solvd.laba.daoImplementation.AthletesDaoImpl;
import com.solvd.laba.daoImplementation.TeamsDaoImpl;
import com.solvd.laba.model.Athlete;
import com.solvd.laba.model.Team;

public class AthleteService {
    private final AthletesDaoImpl athletes;
    private final TeamsDaoImpl teams;

    public AthleteService(AthletesDaoImpl athletes, TeamsDaoImpl teams) {
        this.athletes = athletes;
        this.teams = teams;
    }

    public void createAthlete(int athleteId, String athleteName, String gender, int age, int teamId) {
        Team team = teams.getById(teamId);
        Athlete athlete = new Athlete(athleteId, athleteName, gender, age, team);
        athletes.insert(athlete);
    }
}

