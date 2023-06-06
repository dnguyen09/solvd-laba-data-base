package com.solvd.laba.model;

public class InternationalOlympicCommitee {
    //properties

    private int iocId;
    private String iocName;
    private String president;
    private String headQuater;
    private int year_established;

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

    public int getYear_established() {
        return year_established;
    }

    public void setYear_established(int year_established) {
        this.year_established = year_established;
    }

    @Override
    public String toString() {
        return "InternationalOlympicCommitee{" +
                "iocId=" + iocId +
                ", iocName='" + iocName + '\'' +
                ", president='" + president + '\'' +
                ", headQuater='" + headQuater + '\'' +
                ", year_established=" + year_established +
                '}';
    }
}
