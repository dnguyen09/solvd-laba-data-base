package com.solvd.laba.lab1.services;

import com.solvd.laba.lab1.daoImplementation.HotelDaoImpl;
import com.solvd.laba.lab1.daoImplementation.NationDaoImpl;
import com.solvd.laba.lab1.daoImplementation.TeamDaoImpl;
import com.solvd.laba.lab1.model.Hotel;
import com.solvd.laba.lab1.model.Nation;
import com.solvd.laba.lab1.model.Team;

public class TeamService {
    private final TeamDaoImpl teamDao;
    private final NationDaoImpl nationDao;
    private final HotelDaoImpl hotelDao;

    public TeamService() {
        this.teamDao = new TeamDaoImpl();
        this.nationDao = new NationDaoImpl();
        this.hotelDao = new HotelDaoImpl();
    }

    public Team getTeamById(int teamId) {
        Nation nation = nationDao.getById(teamId);
        Team team = teamDao.getById(teamId);
        Hotel hotel = hotelDao.getById(teamId);

        team.setNation(nation);
        team.setHotel(hotel);
        return team;
    }
}
