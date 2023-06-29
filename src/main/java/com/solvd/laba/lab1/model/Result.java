package com.solvd.laba.lab1.model;

import com.solvd.laba.lab1.enums.Medal;

public class Result {
    //Fields
    private int resultId;
    private Medal medal;
    private Event event;
    private Athlete athlete;
    private Team team;

    //constructors
    public Result(int resultId, Medal medal, Event event, Athlete athlete, Team team) {
        this.resultId = resultId;
        this.medal = medal;
        this.event = event;
        this.athlete = athlete;
        this.team = team;
    }

    public Result() {
    }

    //getters and setters

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public Medal getMedal() {
        return medal;
    }

    public void setMedal(Medal medal) {
        this.medal = medal;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId=" + resultId +
                ", medal=" + medal +
                ", event=" + event +
                ", athlete=" + athlete +
                ", Team=" + team +
                '}' + "\n";
    }
}
