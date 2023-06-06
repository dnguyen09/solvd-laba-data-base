package com.solvd.laba.model;

import java.time.LocalDate;

public class Events {
    //Fields
    private int eventId;
    private String evenName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int sportId;
    private int locationId;

    //getters and setters

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvenName() {
        return evenName;
    }

    public void setEvenName(String evenName) {
        this.evenName = evenName;
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

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "Events{" +
                "eventId=" + eventId +
                ", evenName='" + evenName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", sportId=" + sportId +
                ", locationId=" + locationId +
                '}' + "\n";
    }
}
