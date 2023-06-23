package com.solvd.laba.lab5.factory;

import com.solvd.laba.lab5.interfaces.MyBatisService;
import com.solvd.laba.lab5.services.MBAthleteService;
import com.solvd.laba.lab5.services.MBTeamService;

public class MyBatisServiceFactory {

    public <T> MyBatisService<T> createMBService(String entity) {
        MyBatisService<T> myBatisService = null;
        if ("Athlete".equalsIgnoreCase(entity)) {
            myBatisService = (MyBatisService<T>) new MBAthleteService();
        } else if ("Team".equalsIgnoreCase(entity)) {
            myBatisService = (MyBatisService<T>) new MBTeamService();
        }
        return myBatisService;
    }
}
