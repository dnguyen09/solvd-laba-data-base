package com.solvd.laba.lab1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Athlete {
    //Fields

    @JsonProperty("athleteId")
    private int athleteId;

    @JsonProperty("athleteName")
    private String athleteName;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("age")
    private int age;

    @JsonIgnoreProperties
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

    public Athlete(int athleteId) {
        this.athleteId = athleteId;
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
        return "Athlete {" +
                "\n athlete_id = " + athleteId +
                ", athlete_name = '" + athleteName + '\'' +
                ", gender = '" + gender + '\'' +
                ", age = " + age +
                ", team = " + team +
                '}' + "\n";
    }
}
