package com.solvd.laba.lab1.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Location {
    //Fields

    @XmlElement(name = "locationId")
    private int locationId;

    @XmlElement(name = "locationName")
    private String locationName;

    @XmlElement(name = "capacity")
    private Integer capacity;

    @XmlElement(name = "city")
    private City city;

    //constructors

    public Location(int locationId, String locationName, Integer capacity, City city) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.capacity = capacity;
        this.city = city;
    }

    public Location() {
    }

    //getters and setters
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", capacity=" + capacity +
                ", city=" + city.getCityId() +
                '}' + "\n";
    }
}
