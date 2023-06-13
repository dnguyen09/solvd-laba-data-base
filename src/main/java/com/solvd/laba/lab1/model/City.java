package com.solvd.laba.lab1.model;

public class City {

    //Fields
    private int cityId;
    private String cityName;
    private HostCountry hostCountry;

    //constructors
    public City(int cityId, String cityName, HostCountry hostCountry) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.hostCountry = hostCountry;
    }

    public City() {

    }

    //setters and getters
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public HostCountry getHostCountry() {
        return hostCountry;
    }

    public void setHostCountry(HostCountry hostCountry) {
        this.hostCountry = hostCountry;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", hostCountry=" + hostCountry.getHostCountryId() +
                '}' + "\n";
    }
}


