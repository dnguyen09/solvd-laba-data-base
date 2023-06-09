package com.solvd.laba.daoInterfaces;

import com.solvd.laba.dao.DAO;
import com.solvd.laba.model.Team;

import java.util.List;

public interface TeamsDAO extends DAO<Team> {
    List<Team> getTeamByNationId(int id);
}
