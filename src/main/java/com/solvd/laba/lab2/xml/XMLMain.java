package com.solvd.laba.lab2.xml;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class XMLMain {
    private static final String XML_FILE_PATH = "src/main/resources/xml/OlympicData.xml";
    private static final String XSD_FILE_PATH = "src/main/resources/xml/OlympicData.xsd";
    private static final String XML_EVENT_PATH = "src/main/resources/xml/Event.xml";


    public static void main(String[] args) {
        //create Validator instance to validate xml
        XMLValidator xmlValidator = new XMLValidator();

        //create XMLParser to parse XML
        XMLParser xmlParser = new XMLParser();

        //validate xml using xmlValidator
        xmlValidator.validate(XML_FILE_PATH, XSD_FILE_PATH);

        //parse XML file using xmlParser
        try {
            xmlParser.XmlEventReader(XML_EVENT_PATH);
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
