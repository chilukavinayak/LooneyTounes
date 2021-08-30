package com.java.learn.designpattern.creational.builder.car.example.director;

import com.java.learn.designpattern.creational.builder.car.example.Builder;
import com.java.learn.designpattern.creational.builder.car.example.components.*;
import com.java.learn.designpattern.creational.builder.car.example.enums.BreakType;
import com.java.learn.designpattern.creational.builder.car.example.enums.FuelType;
import com.java.learn.designpattern.creational.builder.car.example.enums.Transmission;
import com.java.learn.designpattern.creational.builder.car.example.vechiles.Car;
import com.java.learn.designpattern.creational.builder.car.example.vechiles.Truck;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.setBreaks(new Breaks(BreakType.ANTI_LOCK));
        builder.setEngine(new Engine(7200, Transmission.AUTOMATIC, FuelType.PETROL));
        builder.setHeatedSeats(new HeatedSeats(true));
        builder.setMusicSystem(new MusicSystem("Phontom Music System"));
        builder.setNavigationSystem(new NavigationSystem());
        builder.setSunRoof(new SunRoof(true));
    }

    public void constructNormalCar(Builder builder){
        builder.setBreaks(new Breaks(BreakType.DRUM));
        builder.setEngine(new Engine(7200, Transmission.MANUAL, FuelType.DESEIL));
        builder.setHeatedSeats(new HeatedSeats(false));
        builder.setMusicSystem(new MusicSystem("Bose Music System"));
        builder.setNavigationSystem(new NavigationSystem());
        builder.setSunRoof(new SunRoof(false));
    }
    public void constructHeavyTruck(Builder builder){
        builder.setBreaks(new Breaks(BreakType.DRUM));
        builder.setEngine(new Engine(7200, Transmission.AUTOMATIC, FuelType.DESEIL));
        builder.setHeatedSeats(new HeatedSeats(false));
        builder.setMusicSystem(new MusicSystem("Sony Music System"));
        builder.setNavigationSystem(new NavigationSystem());
        builder.setSunRoof(new SunRoof(true));
    }

    public void constructNormalTruck(Builder builder){
        builder.setBreaks(new Breaks(BreakType.DRUM));
        builder.setEngine(new Engine(7200, Transmission.AUTOMATIC, FuelType.DESEIL));
        builder.setHeatedSeats(new HeatedSeats(false));
        builder.setMusicSystem(new MusicSystem("No Music System"));
        builder.setNavigationSystem(new NavigationSystem());
        builder.setSunRoof(new SunRoof(false));
    }


}
