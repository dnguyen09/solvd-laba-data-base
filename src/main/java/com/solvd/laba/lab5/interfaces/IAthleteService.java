package com.solvd.laba.lab5.interfaces;

import com.solvd.laba.lab1.model.Athlete;

import java.util.List;

public interface IAthleteService {
    Athlete selectById(int id);

    List<Athlete> selectAllAthlete();

    void insertAthlete(Athlete athlete);

    void updateAthlete(Athlete athlete);

    void deleteAthleteById(int id);
}
