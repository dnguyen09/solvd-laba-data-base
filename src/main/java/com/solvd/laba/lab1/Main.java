package com.solvd.laba.lab1;

import com.solvd.laba.lab1.daoImplementation.HostCountryDaoImpl;
import com.solvd.laba.lab1.model.HostCountry;
import com.solvd.laba.lab1.services.EventService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
//        AthletesDaoImpl rt = new AthletesDaoImpl();

//        List<Athlete> at = rt.getAll();
//
//        LOGGER.info(at);

//        Athlete athlete = new Athlete();
//        athlete.setAthleteName("Ethan Tremblay");
//        athlete.setAthleteId(3);
//        rt.insert(athlete);

//        AthletesDaoImpl at = new AthletesDaoImpl();
//        TeamsDaoImpl team = new TeamsDaoImpl();
//        AthleteService athleteService = new AthleteService(at, team);
//        athleteService.createAthlete(19, "Okochoa", "male", 30, 11);

//
//        int result = rt.update(athlete);

//        Athlete at = rt.getById(7);
//
//        LOGGER.info(at);

//        List<Athlete> athlete = rt.getAthleteByTeamId(2);
//        LOGGER.info(athlete);


//        TeamsImpl tea = new TeamsImpl();
//
//        List<Team> t = tea.getTeamByNationId(1);
//        LOGGER.info(t);
//
//        NationsImpl nations = new NationsImpl();
//        List<Nation> na = nations.getAll();
//        LOGGER.info(na);
//
//        Nation n = nations.getById(5);
//        LOGGER.info(n);
//
//        Nation n2 = new Nation();
//        n2.setNationName("United States");
//        n2.setNationId(13);
//
//        nations.update(n2);
//
//        HotelsImpl h = new HotelsImpl();
//        List<Hotel> ht = h.getAll();
//        LOGGER.info(ht);
//
//       ResultsDaoImpl rs = new ResultsDaoImpl();
//        List<Result> r = rs.getAll();
//        LOGGER.info(r);
//
//        AthletesDaoImpl t = new AthletesDaoImpl();
//        Athlete athelete = t.getById(19);
//        LOGGER.info(athelete);
//
//        int result = t.delete(19);
//        LOGGER.info(result);


        HostCountryDaoImpl hcd = new HostCountryDaoImpl();
        List<HostCountry> hostCountries = hcd.getAll();
        LOGGER.info(hostCountries);

//        HostCountryService scv = new HostCountryService();
//        LOGGER.info(scv.getHostCountry(1));

        LOGGER.info(new EventService().getTeam(8));
    }
}
