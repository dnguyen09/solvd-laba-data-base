package com.solvd.laba.model;

public class Cities {

    //Fields
    private int cityId;
    private String cityName;
    private int hostCountryId;

    //constructors

    public Cities(int cityId, String cityName, int hostCountryId) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.hostCountryId = hostCountryId;
    }

    public Cities() {

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

    public int getHostCountryId() {
        return hostCountryId;
    }

    public void setHostCountryId(int hostCountryId) {
        this.hostCountryId = hostCountryId;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", hosyCountryId=" + hostCountryId +
                '}' + "\n";
    }
}
