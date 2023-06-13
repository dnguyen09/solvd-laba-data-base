package com.solvd.laba.lab1.daoInterfaces;

import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab1.dao.DAO;

import java.util.List;

public interface AthleteDao extends DAO<Athlete> {
    List<Athlete> getByTeamId(int teamId);
}
