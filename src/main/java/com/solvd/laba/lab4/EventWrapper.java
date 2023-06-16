package com.solvd.laba.lab4;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.solvd.laba.lab1.model.Event;

@JsonRootName("event")
public class EventWrapper {

    @JsonProperty("event")
    private Event event;

    //getter and setter
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
