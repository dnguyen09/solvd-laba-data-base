package com.solvd.laba.model;

import java.time.Year;

public class HostCountry {
    //fields
    private int hostCountryId;
    private String countryName;
    private String continent;
    private String capitalCity;
    private Year yearOfHost;
    private int iocId;

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

    public int getIocId() {
        return iocId;
    }

    public void setIocId(int iocId) {
        this.iocId = iocId;
    }

    @Override
    public String toString() {
        return "hostCountry{" +
                "hostCountryId=" + hostCountryId +
                ", countryName='" + countryName + '\'' +
                ", continent='" + continent + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", yearOfHost=" + yearOfHost +
                ", iocId=" + iocId + '}' + "\n";
    }
}
