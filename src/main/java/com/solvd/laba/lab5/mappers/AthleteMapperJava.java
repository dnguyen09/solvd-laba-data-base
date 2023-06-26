package com.solvd.laba.lab5.mappers;

import com.solvd.laba.lab1.model.Athlete;

import java.util.List;

public interface AthleteMapperJava {
    Athlete selectAthleteById(int id);

    List<Athlete> selectAll();

    void insertAthlete(Athlete athlete);

    void updateAthlete(Athlete athlete);

    void deleteAthlete(int id);

}
