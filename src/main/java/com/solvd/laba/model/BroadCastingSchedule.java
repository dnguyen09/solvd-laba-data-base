package com.solvd.laba.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class BroadCastingSchedule {
    //Fields
    private int broadCastId;
    private String channel;
    private LocalDate broadCastDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private Event event;

    //constructors

    public BroadCastingSchedule(int broadCastId, String channel, LocalDate broadCastDate, LocalTime startTime, LocalTime endTime, Event event) {
        this.broadCastId = broadCastId;
        this.channel = channel;
        this.broadCastDate = broadCastDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.event = event;
    }

    public BroadCastingSchedule() {
    }

    //setters and getters

    public int getBroadCastId() {
        return broadCastId;
    }

    public void setBroadCastId(int broadCastId) {
        this.broadCastId = broadCastId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public LocalDate getBroadCastDate() {
        return broadCastDate;
    }

    public void setBroadCastDate(LocalDate broadCastDate) {
        this.broadCastDate = broadCastDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "BroadCastingSchedule{" +
                "broadCastId=" + broadCastId +
                ", channel='" + channel + '\'' +
                ", broadCastDate=" + broadCastDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", event=" + event.getEventId() +
                '}' + "\n";
    }
}
