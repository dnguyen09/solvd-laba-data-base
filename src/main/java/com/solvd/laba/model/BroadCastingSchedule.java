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
    private int eventId;

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

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "BroadCastingSchedule{" +
                "broadCastId=" + broadCastId +
                ", channel='" + channel + '\'' +
                ", broadCastDate=" + broadCastDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", eventId=" + eventId +
                '}' + "\n";
    }
}
