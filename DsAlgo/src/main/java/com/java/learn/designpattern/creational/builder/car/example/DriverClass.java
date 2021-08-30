package com.java.learn.designpattern.creational.builder.car.example;

import com.java.learn.designpattern.creational.builder.car.example.builder.CarBuilder;
import com.java.learn.designpattern.creational.builder.car.example.builder.TruckBuilder;
import com.java.learn.designpattern.creational.builder.car.example.director.Director;
import com.java.learn.designpattern.creational.builder.car.example.vechiles.Car;
import com.java.learn.designpattern.creational.builder.car.example.vechiles.Truck;

public class DriverClass {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car sportCar = builder.getCar();

        System.out.println(sportCar);

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructHeavyTruck(truckBuilder);

        Truck truck = truckBuilder.getTruck();

        System.out.println(truck);




    }

}
