package com.solvd.laba.lab5.interfaces;

import com.solvd.laba.lab1.model.Team;

import java.util.List;

public interface ITeamService {
    Team selectTeamById(int id);

    List<Team> selectAll();

    void insertTeam(Team team);

    void updateTeam(Team team);

    void deleteTeamById(int id);
}
