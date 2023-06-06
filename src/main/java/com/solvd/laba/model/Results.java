package com.solvd.laba.model;

public class Results {
    //Fields
    private int resultId;
    private String medal;
    private int eventId;
    private int athleteId;
    private int teamId;

    //getters and setters

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
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

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Results{" +
                "resultId=" + resultId +
                ", medal='" + medal + '\'' +
                ", eventId=" + eventId +
                ", athleteId=" + athleteId +
                ", teamId=" + teamId +
                '}' + "\n";
    }
}
