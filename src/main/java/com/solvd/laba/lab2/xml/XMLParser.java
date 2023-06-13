package com.solvd.laba.lab2.xml;

import com.solvd.laba.lab1.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    private static final Logger LOGGER = LogManager.getLogger(XMLParser.class);

    public void XmlEventReader(String xmlPath) throws FileNotFoundException, XMLStreamException {
        //create instance of XMLInputFactory
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

        //read XML events from the input file using XMLEventReader
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(xmlPath));

        Event event = new Event();
        int currentTeamIndex = 0;

        while (reader.hasNext()) {
            XMLEvent xmlEvent = reader.nextEvent();

            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                switch (startElement.getName().getLocalPart()) {
                    case "event":
                        LOGGER.info("Start of event");
                        break;
                    case "eventId":
                        xmlEvent = reader.nextEvent();
                        event.setEventId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        LOGGER.info("eventId: " + event.getEventId());
                        break;
                    case "eventName":
                        xmlEvent = reader.nextEvent();
                        event.setEventName(xmlEvent.asCharacters().getData());
                        LOGGER.info("eventName: " + event.getEventName());
                        break;
                    case "startDate":
                        xmlEvent = reader.nextEvent();
                        event.setStartDate(LocalDate.parse(xmlEvent.asCharacters().getData()));
                        LOGGER.info("startDate: " + event.getStartDate());
                        break;
                    case "endDate":
                        xmlEvent = reader.nextEvent();
                        event.setEndDate(LocalDate.parse(xmlEvent.asCharacters().getData()));
                        LOGGER.info("endDate: " + event.getEndDate());
                        break;
                    case "sport":
                        Sport sport = new Sport();
                        event.setSport(sport);
                        LOGGER.info("Start of sport element");
                        break;
                    case "sportId":
                        xmlEvent = reader.nextEvent();
                        event.getSport().setSportId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        LOGGER.info("sportId: " + event.getSport().getSportId());
                        break;
                    case "sportName":
                        xmlEvent = reader.nextEvent();
                        event.getSport().setSportName(xmlEvent.asCharacters().getData());
                        LOGGER.info("sportName: " + event.getSport().getSportName());
                        break;
                    case "location":
                        Location location = new Location();
                        event.setLocation(location);
                        LOGGER.info("Start of location element");
                        break;
                    case "locationId":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().setLocationId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        LOGGER.info("locationId: " + event.getLocation().getLocationId());
                        break;
                    case "locationName":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().setLocationName(xmlEvent.asCharacters().getData());
                        LOGGER.info("locationName: " + event.getLocation().getLocationName());
                        break;
                    case "capacity":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().setCapacity(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        LOGGER.info("capacity: " + event.getLocation().getCapacity());
                        break;
                    case "city":
                        City city = new City();
                        event.getLocation().setCity(city);
                        LOGGER.info("Start of city element");
                        break;
                    case "cityId":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().getCity().setCityId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        LOGGER.info("cityId: " + event.getLocation().getCity().getCityId());
                        break;
                    case "cityName":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().getCity().setCityName(xmlEvent.asCharacters().getData());
                        LOGGER.info("cityName: " + event.getLocation().getCity().getCityName());
                        break;
                    case "teams":
                        List<Team> teams = new ArrayList<>();
                        event.setTeams(teams);
                        LOGGER.info("Start of teams element");
                        break;
                    case "team":
                        Team team = new Team();
                        event.getTeams().add(team);
                        currentTeamIndex = event.getTeams().size() - 1;
                        break;
                    case "teamId":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).setTeamId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        LOGGER.info("teamId: " + event.getTeams().get(currentTeamIndex).getTeamId());
                        break;
                    case "teamName":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).setTeamName(xmlEvent.asCharacters().getData());
                        LOGGER.info("teamName: " + event.getTeams().get(currentTeamIndex).getTeamName());
                        break;
                    case "nation":
                        Nation nation = new Nation();
                        event.getTeams().get(currentTeamIndex).setNation(nation);
                        LOGGER.info("Start of nation element");
                        break;
                    case "nationId":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).getNation().setNationId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        LOGGER.info("nationId: " + event.getTeams().get(currentTeamIndex).getNation().getNationId());
                        break;
                    case "nationName":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).getNation().setNationName(xmlEvent.asCharacters().getData());
                        LOGGER.info("nationName: " + event.getTeams().get(currentTeamIndex).getNation().getNationName());
                        break;
                    case "region":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).getNation().setRegion(xmlEvent.asCharacters().getData());
                        LOGGER.info("region: " + event.getTeams().get(currentTeamIndex).getNation().getRegion());
                        break;
                }
            }

            if (xmlEvent.isEndElement()) {
                EndElement endElement = xmlEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("event")) {
                    LOGGER.info("End of event");
                }
            }
        }
    }
}
