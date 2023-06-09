package com.solvd.laba.daoInterfaces;

import com.solvd.laba.dao.DAO;
import com.solvd.laba.model.Athlete;

import java.util.List;

public interface AthletesDAO extends DAO<Athlete> {
    List<Athlete> getAthleteByTeamId(int teamId);
}
