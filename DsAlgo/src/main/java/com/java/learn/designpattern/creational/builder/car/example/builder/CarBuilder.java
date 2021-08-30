package com.java.learn.designpattern.creational.builder.car.example.builder;

import com.java.learn.designpattern.creational.builder.car.example.Builder;
import com.java.learn.designpattern.creational.builder.car.example.component.Indicator;
import com.java.learn.designpattern.creational.builder.car.example.component.Engine;
import com.java.learn.designpattern.creational.builder.car.example.component.CarType;
import com.java.learn.designpattern.creational.builder.car.example.component.Transmission;
import com.java.learn.designpattern.creational.builder.car.example.component.GPSNavigation;

public class CarBuilder implements Builder {
    private Indicator indicator;
    private Engine engine;
    private GPSNavigation gpsNavigation;
    private Transmission transmission;
    private CarType carType;

    @Override
    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setGPSNavigation(GPSNavigation gpsNavigation) {
        this.gpsNavigation = gpsNavigation;
    }

    @Override
    public void setTranmission(Transmission tranmission) {
        this.transmission = tranmission;

    }
}
