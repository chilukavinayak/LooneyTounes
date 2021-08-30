package com.java.learn.designpattern.creational.builder.car.example.components;

import com.java.learn.designpattern.creational.builder.car.example.enums.BreakType;

public class Breaks {
    private BreakType breakType;

    public Breaks(BreakType type){
        this.breakType = type;
    }

    public BreakType getBreakType() {
        return breakType;
    }

    public void setBreakType(BreakType breakType) {
        this.breakType = breakType;
    }

    @Override
    public String toString() {
        return "Breaks{" +
                "breakType=" + breakType +
                '}';
    }
}
