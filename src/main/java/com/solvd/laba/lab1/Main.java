package com.solvd.laba.lab1;

import com.solvd.laba.lab1.daoImplementation.AthleteDaoImpl;
import com.solvd.laba.lab1.model.Athlete;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        AthleteDaoImpl t = new AthleteDaoImpl();
        Athlete athelete = t.getById(17);
        LOGGER.info(athelete);

//        HostCountryDaoImpl hcd = new HostCountryDaoImpl();
//        List<HostCountry> hostCountries = hcd.getAll();
//        LOGGER.info(hostCountries);
//
//        HostCountryService scv = new HostCountryService();
//        LOGGER.info(scv.getHostCountry(1));

//        LOGGER.info(new EventService().getTeam(8));

//        LOGGER.info(new TeamService().getNationAndHotel(3));
    }
}
