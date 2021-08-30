package com.java.learn.designpattern.creational.builder.car.example.director;

import com.java.learn.designpattern.creational.builder.car.example.Builder;
import com.java.learn.designpattern.creational.builder.car.example.builder.CarBuilder;
import com.java.learn.designpattern.creational.builder.car.example.builder.TruckBuilder;
import com.java.learn.designpattern.creational.builder.car.example.components.*;
import com.java.learn.designpattern.creational.builder.car.example.enums.BreakType;
import com.java.learn.designpattern.creational.builder.car.example.enums.FuelType;
import com.java.learn.designpattern.creational.builder.car.example.enums.Transmission;

public class Director {
    public void constructSportsCar(CarBuilder builder){
        builder.setBreaks(new Breaks(BreakType.ANTI_LOCK));
        builder.setEngine(new Engine(7200, Transmission.AUTOMATIC, FuelType.PETROL));
        builder.setHeatedSeats(new HeatedSeats(true));
        builder.setMusicSystem(new MusicSystem("Phontom Music System"));
        builder.setNavigationSystem(new NavigationSystem());
        builder.setSunRoof(new SunRoof(true));
    }

    public void constructNormalCar(CarBuilder builder){
        builder.setBreaks(new Breaks(BreakType.DRUM));
        builder.setEngine(new Engine(1600, Transmission.MANUAL, FuelType.DESEIL));
        builder.setHeatedSeats(new HeatedSeats(false));
        builder.setMusicSystem(new MusicSystem("Bose Music System"));
        builder.setNavigationSystem(new NavigationSystem());
        builder.setSunRoof(new SunRoof(false));
    }
    public void constructHeavyTruck(TruckBuilder builder){
        builder.setBreaks(new Breaks(BreakType.DRUM));
        builder.setEngine(new Engine(16000, Transmission.AUTOMATIC, FuelType.DESEIL));
        builder.setHeatedSeats(new HeatedSeats(false));
        builder.setMusicSystem(new MusicSystem("Sony Music System"));
        builder.setNavigationSystem(new NavigationSystem());
        builder.setSunRoof(new SunRoof(true));
    }

    public void constructNormalTruck(TruckBuilder builder){
        builder.setBreaks(new Breaks(BreakType.DRUM));
        builder.setEngine(new Engine(4000, Transmission.AUTOMATIC, FuelType.DESEIL));
        builder.setHeatedSeats(new HeatedSeats(false));
        builder.setMusicSystem(new MusicSystem("No Music System"));
        builder.setNavigationSystem(new NavigationSystem());
        builder.setSunRoof(new SunRoof(false));
    }


}
