package com.solvd.laba.model;

public class Hotel {
    //Fields
    private int hotelId;
    private String hotelName;
    private City city;

    //constructors

    public Hotel(int hotelId, String hotelName, City city) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.city = city;
    }

    public Hotel() {

    }

    //getters and setters
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel_id=" + hotelId +
                ", hotel_name='" + hotelName + '\'' +
                ", city_id=" + city.getCityId() +
                '}' + "\n";
    }
}
