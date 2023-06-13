package com.solvd.laba.lab1.daoInterfaces;

import com.solvd.laba.lab1.dao.DAO;
import com.solvd.laba.lab1.model.Team;

import java.util.List;

public interface TeamDao extends DAO<Team> {
    List<Team> getByTeamId(int teamId);

    List<Team> getTeamsByEventId(int eventId);
}
