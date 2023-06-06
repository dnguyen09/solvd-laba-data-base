package com.solvd.laba.model;

public class Nations {
    //Fields
    private int nationId;
    private String nationName;
    private String region;

    //setters and getters

    public int getNationId() {
        return nationId;
    }

    public void setNationId(int nationId) {
        this.nationId = nationId;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Nations{" +
                "nationId=" + nationId +
                ", nationName='" + nationName + '\'' +
                ", region='" + region + '\'' +
                '}' + "\n";
    }
}
