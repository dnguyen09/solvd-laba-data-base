package com.solvd.laba.lab1.model;

public class Athlete {
    //Fields
    private int athleteId;
    private String athleteName;
    private String gender;
    private int age;
    private Team team;

    //constructor
    public Athlete(int athleteId, String athleteName, String gender, int age, Team team) {
        this.athleteId = athleteId;
        this.athleteName = athleteName;
        this.gender = gender;
        this.age = age;
        this.team = team;
    }

    public Athlete() {

    }

    //getters and setters

    public int getAthleteId() {
        return athleteId;
    }

    public void setAthleteId(int athleteId) {
        this.athleteId = athleteId;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "athlete_id=" + athleteId +
                ", athlete_name='" + athleteName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", team_id=" + team.getTeamId() +
                '}' + "\n";
    }
}
