package com.solvd.laba.services;

import com.solvd.laba.daoImplementation.HostCountryDaoImpl;
import com.solvd.laba.daoImplementation.IocDaoImpl;
import com.solvd.laba.model.HostCountry;
import com.solvd.laba.model.InternationalOlympicCommitee;

public class HostCountryService {
    private final HostCountryDaoImpl hostCountryDAO;
    private final IocDaoImpl iocDAO;

    public HostCountryService() {
        this.hostCountryDAO = new HostCountryDaoImpl();
        this.iocDAO = new IocDaoImpl();
    }

    public HostCountry getHostCountry(int hostCountryId) {
        //retrieve host country details
        HostCountry hostCountry = hostCountryDAO.getById(hostCountryId);

        //retrieve IOC details
        InternationalOlympicCommitee ioc = iocDAO.getById(hostCountryId);

        //set the IOC for the host country
        hostCountry.setIoc(ioc);

        return hostCountry;
    }
}
