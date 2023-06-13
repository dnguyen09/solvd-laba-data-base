package com.solvd.laba.lab1.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Nation {
    //Fields

    @XmlElement(name = "nationId")
    private int nationId;

    @XmlElement(name = "nationName")
    private String nationName;

    @XmlElement(name = "region")
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
