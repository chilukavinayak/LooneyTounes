package com.java.learn.designpattern.creational.builder.car.example;

import com.java.learn.designpattern.creational.builder.car.example.component.*;

public interface Builder {
    void setIndicator(Indicator indicator);
    void setEngine(Engine engine);
    void setCarType(CarType type);
    void setGPSNavigation(GPSNavigation gpsNavigation);
    void setTranmission(Transmission tranmission);
    void setNumberOfSeats(int numberOfSeats);
}
