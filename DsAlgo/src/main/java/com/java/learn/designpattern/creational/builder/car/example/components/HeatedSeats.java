package com.java.learn.designpattern.creational.builder.car.example.components;

public class HeatedSeats {

    private boolean isHeatable;

    public HeatedSeats(boolean isHeatable) {
        this.isHeatable = isHeatable;
    }

    public boolean isHeatable() {
        return isHeatable;
    }

    public void setHeatable(boolean heatable) {
        isHeatable = heatable;
    }

    @Override
    public String toString() {
        return "HeatedSeats{" +
                "isHeatable=" + isHeatable +
                '}';
    }
}
