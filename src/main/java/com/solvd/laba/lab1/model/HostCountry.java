package com.solvd.laba.lab1.model;

import java.time.Year;

public class HostCountry {
    //fields
    private int hostCountryId;
    private String countryName;
    private String continent;
    private String capitalCity;
    private Year yearOfHost;
    private InternationalOlympicCommitee ioc;

    //constructors

    public HostCountry(int hostCountryId, String countryName, String continent, String capitalCity, Year yearOfHost, InternationalOlympicCommitee ioc) {
        this.hostCountryId = hostCountryId;
        this.countryName = countryName;
        this.continent = continent;
        this.capitalCity = capitalCity;
        this.yearOfHost = yearOfHost;
        this.ioc = ioc;
    }

    public HostCountry() {
    }

    //setters and getters
    public int getHostCountryId() {
        return hostCountryId;
    }

    public void setHostCountryId(int hostCountryId) {
        this.hostCountryId = hostCountryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public Year getYearOfHost() {
        return yearOfHost;
    }

    public void setYearOfHost(Year yearOfHost) {
        this.yearOfHost = yearOfHost;
    }

    public InternationalOlympicCommitee getIoc() {
        return ioc;
    }

    public void setIoc(InternationalOlympicCommitee ioc) {
        this.ioc = ioc;
    }

    @Override
    public String toString() {
        return "HostCountry{" +
                "hostCountryId=" + hostCountryId +
                ", countryName='" + countryName + '\'' +
                ", continent='" + continent + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", yearOfHost=" + yearOfHost +
                ", ioc_id=" + ioc +
                '}' + "\n";
    }
}
