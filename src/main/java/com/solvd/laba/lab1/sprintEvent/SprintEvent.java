package com.solvd.laba.lab1.sprintEvent;

import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab5.factory.MyBatisServiceFactory;
import com.solvd.laba.lab5.interfaces.IAthleteService;
import com.solvd.laba.lab5.interfaces.IResultService;

import java.util.List;

public class SprintEvent {
    private IAthleteService mbAthleteService;
    private IResultService mbResultService;


    public SprintEvent() {
        MyBatisServiceFactory myBatisServiceFactory = new MyBatisServiceFactory();
        this.mbAthleteService = myBatisServiceFactory.pickAthleteService("mybatis");
        this.mbResultService = myBatisServiceFactory.pickResultService("mybatis");
    }

    public List<Athlete> selectParticipantByEventName(String eventName) {
        // Retrieve participants from the athlete service
        return mbAthleteService.selectAthleteByEventName(eventName);
    }

    public List<Athlete> simulateSprint(List<Athlete> athletes) {
        //add the logic to simulate the sprint
        //then determine the order of athlete when reach finish line
        return athletes;
    }
}
