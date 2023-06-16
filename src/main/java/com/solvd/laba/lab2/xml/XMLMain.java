package com.solvd.laba.lab2.xml;

import com.solvd.laba.lab1.model.Event;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class XMLMain {
    private static final String XML_FILE_PATH = "src/main/resources/xml/OlympicData.xml";
    private static final String XSD_FILE_PATH = "src/main/resources/xml/OlympicData.xsd";
    private static final String XML_EVENT_PATH = "src/main/resources/xml/Event.xml";
    private static final Logger LOGGER = LogManager.getLogger(XMLMain.class);


    public static void main(String[] args) {
        //create Validator instance to validate xml
        XMLValidator xmlValidator = new XMLValidator();

        //create XMLParser to parse XML
        XMLParser xmlParser = new XMLParser();

        //validate xml using xmlValidator
        xmlValidator.validate(XML_FILE_PATH, XSD_FILE_PATH);

        //parse XML file using xmlParser
        try {
            Event event = xmlParser.XmlEventReader(XML_EVENT_PATH);
            LOGGER.info(event);
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
