package com.techreturners.cats;

import java.lang.Math;


public class DomesticCat extends AbstractCat {
    private String setting = "domestic";
    private int averageHeight = 23;

    public String getSetting() {
        return setting;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public String eat() {
        double rand = Math.random() * 1;
        if ( rand < 0.5 ) {
            return "It will do I suppose";
        }
        else { return "Purrrrrrr"; }
    }
}