package com.java.learn.designpattern.creational.builder.car.example.vechiles;

import com.java.learn.designpattern.creational.builder.car.example.components.*;

public class Truck {
    private Engine engine;
    private HeatedSeats heatedSeats;
    private MusicSystem musicSystem;
    private NavigationSystem navigationSystem;
    private Breaks breaks;
    private SunRoof sunRoof;

    public Truck(Engine engine, HeatedSeats heatedSeats, MusicSystem musicSystem, NavigationSystem navigationSystem, Breaks breaks, SunRoof sunRoof) {
        this.engine = engine;
        this.heatedSeats = heatedSeats;
        this.musicSystem = musicSystem;
        this.navigationSystem = navigationSystem;
        this.breaks = breaks;
        this.sunRoof = sunRoof;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public HeatedSeats getHeatedSeats() {
        return heatedSeats;
    }

    public void setHeatedSeats(HeatedSeats heatedSeats) {
        this.heatedSeats = heatedSeats;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    public NavigationSystem getNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(NavigationSystem navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public Breaks getBreaks() {
        return breaks;
    }

    public void setBreaks(Breaks breaks) {
        this.breaks = breaks;
    }

    public SunRoof getSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(SunRoof sunRoof) {
        this.sunRoof = sunRoof;
    }
}
