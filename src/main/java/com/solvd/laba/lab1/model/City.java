package com.solvd.laba.lab1.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class City {

    //Fields

    @XmlElement(name = "cityId")
    private int cityId;

    @XmlElement(name = "cityName")
    private String cityName;

    @XmlTransient
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
        return " City {" +
                " cityId =" + cityId +
                ", cityName = '" + cityName + '\'' +
                ", hostCountry = " + hostCountry +
                '}' + "\n";
    }
}


