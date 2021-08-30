package com.java.learn.designpattern.creational.builder.example1;

public class Car {
    private Indicator indicator;
    private Transmission transmission;
    private Engine engine;
    private GPSNavigation navigation;
    private int numberOfSeats;
    private CarType carType;

    public Car(Indicator indicator, Transmission transmission, Engine engine, GPSNavigation navigation, int numberOfSeats, CarType carType) {
        this.indicator = indicator;
        this.transmission = transmission;
        this.engine = engine;
        this.navigation = navigation;
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }
}
