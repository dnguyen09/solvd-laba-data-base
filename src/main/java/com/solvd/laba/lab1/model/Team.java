package com.solvd.laba.lab1.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Team {
    //Fields

    @XmlElement(name = "teamId")
    private int teamId;

    @XmlElement(name = "teamName")
    private String teamName;

    @XmlElement(name = "nation")
    private Nation nation;

    @XmlTransient
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
        return "Team { " +
                "\n teamId = " + teamId +
                ", teamName = '" + teamName + '\'' +
                ", nation = " + nation +
                ", hotel = " + hotel +
                '}' + "\n";
    }
}
