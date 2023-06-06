package com.solvd.laba.model;

public class Athletes {
    //Fields
    private int athleteId;
    private String athleteName;
    private String gender;
    private int age;
    private int teamId;

    //setters and getters
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

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Athletes{" +
                "athleteId=" + athleteId +
                ", athleteName='" + athleteName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", teamId=" + teamId +
                '}' + "\n";
    }
}
