package com.solvd.laba.model;

public class Locations {
    //Fields
    private int locationId;
    private String locationName;
    private Integer capacity;
    private int cityId;

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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


    @Override
    public String toString() {
        return "Locations{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", capacity=" + capacity +
                ", cityId=" + cityId +
                '}' + "\n";
    }
}
