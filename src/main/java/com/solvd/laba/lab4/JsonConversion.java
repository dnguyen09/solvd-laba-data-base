package com.solvd.laba.lab4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.laba.lab1.model.Event;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JsonConversion {
    private static final String JSON_PATH = "src/main/resources/json/event.json";
    private static final Logger LOGGER = LogManager.getLogger(JsonConversion.class);

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            EventWrapper eventWrapper = objectMapper.readValue(new File(JSON_PATH), EventWrapper.class);
            Event deserilizedEvent = eventWrapper.getEvent();
            LOGGER.info(deserilizedEvent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
