package com.java.learn.designpattern.creational.builder.car.example.builder;

import com.java.learn.designpattern.creational.builder.car.example.Builder;
import com.java.learn.designpattern.creational.builder.car.example.components.*;
import com.java.learn.designpattern.creational.builder.car.example.vechiles.Car;
import com.java.learn.designpattern.creational.builder.car.example.vechiles.Truck;

public class TruckBuilder implements Builder {
    private Engine engine;
    private HeatedSeats heatedSeats;
    private NavigationSystem navigationSystem;
    private Breaks breaks;
    private MusicSystem musicSystem;
    private SunRoof sunRoof;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setHeatedSeats(HeatedSeats heatedSeats) {
        this.heatedSeats = heatedSeats;
    }

    @Override
    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public void setNavigationSystem(NavigationSystem navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    @Override
    public void setBreaks(Breaks breaks) {
        this.breaks = breaks;
    }

    @Override
    public void setSunRoof(SunRoof sunRoof) {
        this.sunRoof = sunRoof;
    }

    public Truck getTruck(){
        return new Truck(engine,heatedSeats,musicSystem,navigationSystem,breaks,sunRoof);
    }
}
