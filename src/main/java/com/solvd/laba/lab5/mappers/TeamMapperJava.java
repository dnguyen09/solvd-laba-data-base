package com.solvd.laba.lab5.mappers;

import com.solvd.laba.lab1.model.Team;

import java.util.List;

public interface TeamMapperJava {
    Team selectTeamById(int id);

    List<Team> selectAll();

    void insertTeam(Team team);

}
