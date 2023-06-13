package com.solvd.laba.lab1.model;

public class InternationalOlympicCommitee {
    //properties

    private int iocId;
    private String iocName;
    private String president;
    private String headQuater;
    private int yearEstablished;

    //setters and getters

    public int getIocId() {
        return iocId;
    }

    public void setIocId(int iocId) {
        this.iocId = iocId;
    }

    public String getIocName() {
        return iocName;
    }

    public void setIocName(String iocName) {
        this.iocName = iocName;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getHeadQuater() {
        return headQuater;
    }

    public void setHeadQuater(String headQuater) {
        this.headQuater = headQuater;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int year_established) {
        this.yearEstablished = year_established;
    }

    @Override
    public String toString() {
        return "InternationalOlympicCommitee{" +
                "iocId=" + iocId +
                ", iocName='" + iocName + '\'' +
                ", president='" + president + '\'' +
                ", headQuater='" + headQuater + '\'' +
                ", year_established=" + yearEstablished +
                '}';
    }
}
