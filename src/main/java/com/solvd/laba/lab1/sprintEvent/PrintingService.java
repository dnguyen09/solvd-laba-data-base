package com.solvd.laba.lab1.sprintEvent;

import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab1.model.Result;
import com.solvd.laba.lab5.factory.MyBatisServiceFactory;
import com.solvd.laba.lab5.interfaces.IResultService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class PrintingService {
    private static final Logger LOGGER = LogManager.getLogger(PrintingService.class);
    private final IResultService mbResultService;

    public PrintingService() {
        MyBatisServiceFactory myBatisServiceFactory = new MyBatisServiceFactory();
        this.mbResultService = myBatisServiceFactory.pickResultService("mybatis");
    }

    public void printAthleteList(List<Athlete> athletes) {
        LOGGER.info("List of athletes participating in this event");
        System.out.println();
        for (int i = 0; i < athletes.size(); i++) {
            Athlete athlete = athletes.get(i);
            LOGGER.info((i + 1) + "." + athlete);
        }
    }

    public void displayResult(String eventName) {
        System.out.println();
        LOGGER.info("Result for the event: " + eventName);
        // Retrieve results from the result service and print them
        List<Result> results = mbResultService.selectResultByEventId(4);
        for (Result result : results) {
            LOGGER.info("Athlete ID: " + result.getAthlete().getAthleteId() + "\n" +
                    "Athlete name: " + result.getAthlete().getAthleteName() + "\n" +
                    "Event ID: " + result.getEvent().getEventId() + "\n" +
                    "Event name: " + result.getEvent().getEventName() + "\n" +
                    "Medal: " + result.getMedal() + "\n");
        }
    }

    public void greeting() {
        LOGGER.info("Welcome to Sprint Event");
    }
}
