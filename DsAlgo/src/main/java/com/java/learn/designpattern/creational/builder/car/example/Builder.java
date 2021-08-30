package com.java.learn.designpattern.creational.builder.car.example;

import com.java.learn.designpattern.creational.builder.car.example.components.*;

public interface Builder {
    void setEngine(Engine engine);
    void setHeatedSeats(HeatedSeats heatedSeats);
    void setMusicSystem(MusicSystem musicSystem);
    void setNavigationSystem(NavigationSystem navigationSystem);
    void setBreaks(Breaks breaks);
    void setSunRoof(SunRoof sunRoof);
}
