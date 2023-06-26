package com.solvd.laba.lab5.factory;

import com.solvd.laba.lab1.services.AthleteService;
import com.solvd.laba.lab1.services.TeamService;
import com.solvd.laba.lab5.interfaces.IAthleteService;
import com.solvd.laba.lab5.interfaces.ITeamService;
import com.solvd.laba.lab5.services.MBAthleteService;
import com.solvd.laba.lab5.services.MBTeamService;

public class MyBatisServiceFactory {

//    public <T> MyBatisService<T> createMBService(String entity) {
//        MyBatisService<T> myBatisService = null;
//        if ("Athlete".equalsIgnoreCase(entity)) {
//            myBatisService = (MyBatisService<T>) new MBAthleteService();
//        } else if ("Team".equalsIgnoreCase(entity)) {
//            myBatisService = (MyBatisService<T>) new MBTeamService();
//        }
//        return myBatisService;
//    }

    public IAthleteService pickAthleteService(String service) {
        IAthleteService iAthleteService = null;
        if ("Dao".equalsIgnoreCase(service)) {
            iAthleteService = new AthleteService();
        } else if ("MyBatis".equalsIgnoreCase(service)) {
            iAthleteService = new MBAthleteService();
        }
        return iAthleteService;
    }

    public ITeamService pickTeamService(String service) {
        ITeamService iTeamService = null;
        if ("Dao".equalsIgnoreCase(service)) {
            iTeamService = new TeamService();
        } else if ("MyBatis".equalsIgnoreCase(service)) {
            iTeamService = new MBTeamService();
        }
        return iTeamService;
    }


}
