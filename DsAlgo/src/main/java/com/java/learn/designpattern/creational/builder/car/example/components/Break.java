package com.java.learn.designpattern.creational.builder.car.example.components;

import com.java.learn.designpattern.creational.builder.car.example.enums.BreakType;

public class Break {
    private BreakType breakType;

    public Break(BreakType type){
        this.breakType = type;
    }

    public BreakType getBreakType() {
        return breakType;
    }

    public void setBreakType(BreakType breakType) {
        this.breakType = breakType;
    }
}
