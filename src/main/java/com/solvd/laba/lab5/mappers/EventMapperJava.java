package com.solvd.laba.lab5.mappers;

import com.solvd.laba.lab1.model.Event;

public interface EventMapperJava {
    Event selectEventTeamById(int id);

    Event selectEventAthleteById(int id);
}
