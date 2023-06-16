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

    public Event XmlEventReader(String xmlPath) throws FileNotFoundException, XMLStreamException {
        //create instance of XMLInputFactory
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

        //read XML events from the input file using XMLEventReader
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(xmlPath));

        Event event = new Event();
        int currentTeamIndex = 0;
        int currentAthleteIndex = 0;

        while (reader.hasNext()) {
            XMLEvent xmlEvent = reader.nextEvent();

            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                switch (startElement.getName().getLocalPart()) {
                    case "event":
                        break;
                    case "eventId":
                        xmlEvent = reader.nextEvent();
                        event.setEventId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                    case "eventName":
                        xmlEvent = reader.nextEvent();
                        event.setEventName(xmlEvent.asCharacters().getData());
                        break;
                    case "startDate":
                        xmlEvent = reader.nextEvent();
                        event.setStartDate(LocalDate.parse(xmlEvent.asCharacters().getData()));
                        break;
                    case "endDate":
                        xmlEvent = reader.nextEvent();
                        event.setEndDate(LocalDate.parse(xmlEvent.asCharacters().getData()));
                        break;
                    case "sport":
                        Sport sport = new Sport();
                        event.setSport(sport);
                        break;
                    case "sportId":
                        xmlEvent = reader.nextEvent();
                        event.getSport().setSportId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                    case "sportName":
                        xmlEvent = reader.nextEvent();
                        event.getSport().setSportName(xmlEvent.asCharacters().getData());
                        break;
                    case "location":
                        Location location = new Location();
                        event.setLocation(location);
                        break;
                    case "locationId":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().setLocationId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                    case "locationName":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().setLocationName(xmlEvent.asCharacters().getData());
                        break;
                    case "capacity":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().setCapacity(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                    case "city":
                        City city = new City();
                        event.getLocation().setCity(city);
                        break;
                    case "cityId":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().getCity().setCityId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                    case "cityName":
                        xmlEvent = reader.nextEvent();
                        event.getLocation().getCity().setCityName(xmlEvent.asCharacters().getData());
                        break;
                    case "teams":
                        List<Team> teams = new ArrayList<>();
                        event.setTeams(teams);
                        break;
                    case "team":
                        Team team = new Team();
                        event.getTeams().add(team);
                        currentTeamIndex = event.getTeams().size() - 1;
                        break;
                    case "teamId":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).setTeamId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                    case "teamName":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).setTeamName(xmlEvent.asCharacters().getData());
                        break;
                    case "nation":
                        Nation nation = new Nation();
                        event.getTeams().get(currentTeamIndex).setNation(nation);
                        break;
                    case "nationId":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).getNation().setNationId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                    case "nationName":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).getNation().setNationName(xmlEvent.asCharacters().getData());
                        break;
                    case "region":
                        xmlEvent = reader.nextEvent();
                        event.getTeams().get(currentTeamIndex).getNation().setRegion(xmlEvent.asCharacters().getData());
                        break;
                    case "athletes":
                        List<Athlete> athletes = new ArrayList<>();
                        event.setAthletes(athletes);
                        break;
                    case "athlete":
                        Athlete athlete = new Athlete();
                        event.getAthletes().add(athlete);
                        currentAthleteIndex = event.getAthletes().size() - 1;
                        break;
                    case "athleteId":
                        xmlEvent = reader.nextEvent();
                        event.getAthletes().get(currentAthleteIndex).setAthleteId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                    case "athleteName":
                        xmlEvent = reader.nextEvent();
                        event.getAthletes().get(currentAthleteIndex).setAthleteName(xmlEvent.asCharacters().getData());
                        break;
                    case "gender":
                        xmlEvent = reader.nextEvent();
                        event.getAthletes().get(currentAthleteIndex).setGender(xmlEvent.asCharacters().getData());
                        break;
                    case "age":
                        xmlEvent = reader.nextEvent();
                        event.getAthletes().get(currentAthleteIndex).setAge(Integer.parseInt(xmlEvent.asCharacters().getData()));
                        break;
                }
            }

            if (xmlEvent.isEndElement()) {
                EndElement endElement = xmlEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("event")) {
                    LOGGER.info("End of event parsing");
                }
            }
        }
        return event;
    }
}
