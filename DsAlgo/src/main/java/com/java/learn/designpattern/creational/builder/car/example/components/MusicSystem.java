package com.java.learn.designpattern.creational.builder.car.example.components;

public class MusicSystem {
    private String systemName;

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public MusicSystem(String systemName) {
        this.systemName = systemName;
    }

    @Override
    public String toString() {
        return "MusicSystem{" +
                "systemName='" + systemName + '\'' +
                '}';
    }
}
