package com.solvd.laba.lab1.model;

public class Sport {
    //Fields
    private int sportId;
    private String sportName;

    //getters and setters

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "sportId=" + sportId +
                ", sportName='" + sportName + '\'' +
                '}' + "\n";
    }
}
