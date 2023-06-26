package com.solvd.laba.lab1.services;

import com.solvd.laba.lab1.daoImplementation.AthleteDaoImpl;
import com.solvd.laba.lab1.daoImplementation.TeamDaoImpl;
import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab1.model.Team;
import com.solvd.laba.lab5.interfaces.IAthleteService;

import java.util.List;

public class AthleteService implements IAthleteService {
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

    public Athlete getAthlete(int id) {
        Athlete athlete = athleteDao.getById(id);
        Team team = teamDao.getTeamByAthleteId(id);

        athlete.setTeam(team);
        return athlete;
    }

    @Override
    public Athlete selectById(int id) {
        return getAthlete(id);
    }

    @Override
    public List<Athlete> selectAllAthlete() {
        return athleteDao.getAll();
    }

    @Override
    public void insertAthlete(Athlete athlete) {
        athleteDao.insert(athlete);
    }

    @Override
    public void updateAthlete(Athlete athlete) {
        athleteDao.update(athlete);
    }

    @Override
    public void deleteAthleteById(int id) {
        athleteDao.delete(id);
    }
}

