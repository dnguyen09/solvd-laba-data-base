package com.solvd.laba.lab1.sprintEvent.proxyPattern;

import com.solvd.laba.lab1.sprintEvent.SprintEvent;

public class SprintEventProxy implements SprintEventService {
    private SprintEvent sprintEvent;

    public SprintEventProxy() {
        this.sprintEvent = new SprintEvent();
    }

    @Override
    public void start(String eventName) {
        //check event name through proxy
        if (!isValidEvent(eventName)) {
            System.out.println("Proxy: Invalid event name. Aborting the sprint event.");
            return;
        }

        sprintEvent.start(eventName);
    }

    private boolean isValidEvent(String eventName) {
        // Check if the event name matches the valid pattern
        String validPattern = "sprint 100m";

        // Check if the event name is not empty or null
        if (eventName == null || eventName.isEmpty()) {
            return false;
        } else return eventName.equalsIgnoreCase(validPattern);
    }
}
