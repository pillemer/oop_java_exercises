package com.techreturners.cats;

public class DomesticCat implements Cat {
    private Boolean sleeping = false; 
    
    public Boolean isAsleep() {
        return this.sleeping;
    }

    public Boolean goToSleep() {
        this.sleeping = true;
        return this.sleeping;
    }

    public Boolean wakeUp() {
        this.sleeping = false;
        return this.sleeping;
    }
}