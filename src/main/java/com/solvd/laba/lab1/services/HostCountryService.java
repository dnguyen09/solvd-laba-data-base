package com.solvd.laba.lab1.services;

import com.solvd.laba.lab1.daoImplementation.HostCountryDaoImpl;
import com.solvd.laba.lab1.daoImplementation.IocDaoImpl;
import com.solvd.laba.lab1.model.HostCountry;
import com.solvd.laba.lab1.model.InternationalOlympicCommitee;

public class HostCountryService {
    private final HostCountryDaoImpl hostCountryDAO;
    private final IocDaoImpl iocDAO;

    public HostCountryService() {
        this.hostCountryDAO = new HostCountryDaoImpl();
        this.iocDAO = new IocDaoImpl();
    }

    public HostCountry getHostCountry(int iocId) {
        //retrieve host country details
        HostCountry hostCountry = hostCountryDAO.getByIocId(iocId);

        //retrieve IOC
        InternationalOlympicCommitee ioc = iocDAO.getById(iocId);

        //set the IOC for the host country
        hostCountry.setIoc(ioc);

        return hostCountry;
    }
}
