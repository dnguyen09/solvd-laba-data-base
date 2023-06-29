package com.solvd.laba.lab1.services;

import com.solvd.laba.lab1.daoImplementation.HotelDaoImpl;
import com.solvd.laba.lab1.daoImplementation.NationDaoImpl;
import com.solvd.laba.lab1.daoImplementation.TeamDaoImpl;
import com.solvd.laba.lab1.model.Hotel;
import com.solvd.laba.lab1.model.Nation;
import com.solvd.laba.lab1.model.Team;
import com.solvd.laba.lab5.interfaces.ITeamService;

import java.util.List;

public class TeamService implements ITeamService {
    private final TeamDaoImpl teamDao;
    private final NationDaoImpl nationDao;
    private final HotelDaoImpl hotelDao;

    public TeamService() {
        this.teamDao = new TeamDaoImpl();
        this.nationDao = new NationDaoImpl();
        this.hotelDao = new HotelDaoImpl();
    }

    public Team getTeamById(int teamId) {
        Nation nation = nationDao.getNationByTeamId(teamId);
        Team team = teamDao.getById(teamId);
        Hotel hotel = hotelDao.getHotelByTeamId(teamId);

        team.setNation(nation);
        team.setHotel(hotel);
        return team;
    }

    @Override
    public Team selectTeamById(int teamId) {
        return getTeamById(teamId);
    }

    @Override
    public List<Team> selectAll() {
        return teamDao.getAll();
    }

    @Override
    public void insertTeam(Team team) {
        teamDao.insert(team);
    }

    @Override
    public void updateTeam(Team team) {
        teamDao.update(team);
    }

    @Override
    public void deleteTeamById(int id) {
        teamDao.delete(id);
    }
}
