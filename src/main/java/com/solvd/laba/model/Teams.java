package com.solvd.laba.model;

public class Teams {
    //Fields
    private int teamId;
    private String teamName;
    private int nationId;
    private int hotelId;

    //getters and setters

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNationId() {
        return nationId;
    }

    public void setNationId(int nationId) {
        this.nationId = nationId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", nationId=" + nationId +
                ", hotelId=" + hotelId +
                '}' + "\n";
    }
}
