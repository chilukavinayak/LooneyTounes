package com.java.learn.designpattern.creational.builder.car.example.components;

import com.java.learn.designpattern.creational.builder.car.example.enums.FuelType;
import com.java.learn.designpattern.creational.builder.car.example.enums.Transmission;

public class Engine {

    private int cc;
    private Transmission transmission;
    private FuelType fuelType;

    public Engine(int cc, Transmission transmission, FuelType fuelType) {
        this.cc = cc;
        this.transmission = transmission;
        this.fuelType = fuelType;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cc=" + cc +
                ", transmission=" + transmission +
                ", fuelType=" + fuelType +
                '}';
    }
}
