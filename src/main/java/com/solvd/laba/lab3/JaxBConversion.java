package com.solvd.laba.lab3;

import com.solvd.laba.lab1.model.Event;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class JaxBConversion {
    private static final Logger LOGGER = LogManager.getLogger(JaxBConversion.class);

    public static void main(String[] args) {
        try {
            //create JAXBContext for the Event class
            JAXBContext jaxbContext = JAXBContext.newInstance(Event.class);

            //create Unmarshaller for XML unmarshalling
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            //perform XML unmarshalling
            Event unmarshalledEvent = (Event) unmarshaller.unmarshal(new File("src/main/resources/xml/Event.xml"));

            //print data using unmarshalledEvent
            LOGGER.info(unmarshalledEvent);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
