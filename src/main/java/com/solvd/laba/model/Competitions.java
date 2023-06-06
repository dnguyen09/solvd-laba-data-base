package com.solvd.laba.model;

public class Competitions {
    //Fields
    private int competeId;
    private int athleteId;
    private int teamId;
    private int eventId;

    //setters and getters

    public int getCompeteId() {
        return competeId;
    }

    public void setCompeteId(int competeId) {
        this.competeId = competeId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(int athleteId) {
        this.athleteId = athleteId;
    }

    @Override
    public String toString() {
        return "Competitions{" +
                "competeId=" + competeId +
                ", teamId=" + teamId +
                ", eventId=" + eventId +
                '}' + "\n";
    }
}
