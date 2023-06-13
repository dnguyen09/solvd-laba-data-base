package com.solvd.laba.lab1.model;

public class Team {
    //Fields
    private int teamId;
    private String teamName;
    private Nation nation;
    private Hotel hotel;

    //constructors
    public Team(int teamId, String teamName, Nation nation, Hotel hotel) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.nation = nation;
        this.hotel = hotel;
    }

    public Team() {

    }

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

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", nation=" + nation.getNationId() +
                ", hotel=" + hotel.getHotelId() +
                '}';
    }
}
