package com.java.learn.designpattern.creational.builder.car.example;

import com.java.learn.designpattern.creational.builder.car.example.component.*;

public class ManualCar {
    private Indicator indicator;
    private Transmission transmission;
    private Engine engine;
    private GPSNavigation navigation;
    private int numberOfSeats;
    private CarType carType;

    public ManualCar(Indicator indicator, Transmission transmission, Engine engine, GPSNavigation navigation, int numberOfSeats, CarType carType) {
        this.indicator = indicator;
        this.transmission = transmission;
        this.engine = engine;
        this.navigation = navigation;
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }
    public ManualCar(){}

    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GPSNavigation getNavigation() {
        return navigation;
    }

    public void setNavigation(GPSNavigation navigation) {
        this.navigation = navigation;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
