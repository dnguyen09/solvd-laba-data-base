package com.solvd.laba.lab1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.solvd.laba.lab3.LocalDateAdapter;
import com.solvd.laba.lab4.CustDeserializer;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "event")
@XmlAccessorType(XmlAccessType.FIELD)
public class Event {
    //Fields

    @XmlElement(name = "eventId")
    @JsonProperty("eventId")
    private int eventId;

    @XmlElement(name = "eventName")
    @JsonProperty("eventName")
    private String eventName;

    @XmlElement(name = "startDate")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @JsonProperty("startDate")
    @JsonDeserialize(using = CustDeserializer.class)
    private LocalDate startDate;

    @XmlElement(name = "endDate")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @JsonProperty("endDate")
    @JsonDeserialize(using = CustDeserializer.class)
    private LocalDate endDate;

    @XmlElement(name = "sport")
    @JsonProperty("sport")
    private Sport sport;

    @XmlElement(name = "location")
    @JsonProperty("location")
    private Location location;

    @XmlElementWrapper(name = "teams")
    @XmlElement(name = "team")
    @JsonProperty("teams")
    private List<Team> teams;

    @XmlElementWrapper(name = "athletes")
    @XmlElement(name = "athlete")
    @JsonProperty("athletes")
    private List<Athlete> athletes;

    //constructors

    public Event(int eventId, String eventName, LocalDate startDate, LocalDate endDate, Sport sport, Location location, List<Team> teams) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sport = sport;
        this.location = location;
        this.teams = teams;
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

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    @Override
    public String toString() {
        return "Event {" +
                "\n eventId = " + eventId +
                "\n eventName = '" + eventName + '\'' +
                "\n startDate = " + startDate +
                "\n endDate = " + endDate +
                "\n sport = " + sport +
                "location = " + location +
                "teams = " + teams + "\n athletes = " + athletes +
                '}' + "\n";
    }
}






