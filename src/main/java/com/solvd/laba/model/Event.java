package com.solvd.laba.model;

import java.time.LocalDate;
import java.util.List;

public class Event {
    //Fields
    private int eventId;
    private String eventName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Sport sport;
    private Location location;
    private List<Team> team;
    private List<Athlete> athlete;

    //constructors

    public Event(int eventId, String eventName, LocalDate startDate, LocalDate endDate, Sport sport, Location location, List<Team> team, List<Athlete> athlete) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sport = sport;
        this.location = location;
        this.team = team;
        this.athlete = athlete;
    }

    public Event() {
    }

    //getters and setters

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Team> getTeam() {
        return team;
    }

    public void setTeam(List<Team> team) {
        this.team = team;
    }

    public List<Athlete> getAthlete() {
        return athlete;
    }

    public void setAthlete(List<Athlete> athlete) {
        this.athlete = athlete;
    }
}






