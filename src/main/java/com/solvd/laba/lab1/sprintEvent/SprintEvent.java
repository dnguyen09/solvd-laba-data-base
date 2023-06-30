package com.solvd.laba.lab1.sprintEvent;

import com.solvd.laba.lab1.enums.Medal;
import com.solvd.laba.lab1.enums.Position;
import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab1.model.Result;
import com.solvd.laba.lab1.sprintEvent.proxyPattern.SprintEventService;
import com.solvd.laba.lab5.factory.MyBatisServiceFactory;
import com.solvd.laba.lab5.interfaces.IAthleteService;
import com.solvd.laba.lab5.interfaces.IResultService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SprintEvent implements SprintEventService {
    /*fields*/
    private static final Logger LOGGER = LogManager.getLogger(SprintEvent.class);
    private final IAthleteService mbAthleteService;
    private final IResultService mbResultService;
    private final PrintingService printingService;

    /*constructors*/
    public SprintEvent() {
        MyBatisServiceFactory myBatisServiceFactory = new MyBatisServiceFactory();
        this.mbAthleteService = myBatisServiceFactory.pickAthleteService("mybatis");
        this.mbResultService = myBatisServiceFactory.pickResultService("mybatis");
        this.printingService = new PrintingService();
    }

    /*methods*/
    public void start(String eventName) {
        printingService.greeting();
        List<Athlete> athletes = mbAthleteService.selectAthleteByEventName(eventName);

        if (athletes.isEmpty()) {
            LOGGER.info("No athletes found for event: " + eventName);
        } else {
            printingService.printAthleteList(athletes);
            List<Athlete> finishOrder = simulateSprint(athletes);
            determineMedal(finishOrder);
            printingService.displayResult(eventName);
        }
    }

    public void determineMedal(List<Athlete> finishOrder) {
        System.out.println();
        LOGGER.info("The referees announce the result to the athletes");
        System.out.println();

        Medal[] medals = Medal.values();

        for (int i = 0; i < finishOrder.size(); i++) {
            Athlete athlete = finishOrder.get(i);

            if (i < medals.length) {
                Medal medal = medals[i];

                //update new record to result table
                mbResultService.updateMedalByAthleteId(new Result(medal, new Athlete(athlete.getAthleteId())));

                LOGGER.info(athlete.getAthleteName() + " has won the " + medal + " medal!");
            } else {
                LOGGER.info(athlete.getAthleteName() + " is a participant.");
            }
        }
    }

    //add simulation logic to the sprint
    public List<Athlete> simulateSprint(List<Athlete> athletes) {
        LOGGER.info("The event begin");
        System.out.println();
        List<Athlete> finishOrder = new ArrayList<>();

        //shuffle athlete in the list
        Collections.shuffle(athletes);

        for (int i = 0; i < athletes.size(); i++) {
            Athlete athlete = athletes.get(i);
            finishOrder.add(athlete);
            Position position = Position.values()[i];
            LOGGER.info("Athlete " + athlete.getAthleteName() + " is the " + position.name().toLowerCase() + " athlete that has crossed the finish line.");
        }

        return finishOrder;
    }
}
