package com.techreturners.cats;

public class LionCat extends AbstractCat {
    private String setting = "wild";
    private int averageHeight = 1100;

    public String getSetting() {
        return setting;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public String eat() {
        return "Roar!!!!";
    }
}