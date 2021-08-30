package com.java.learn.designpattern.creational.builder.car.example.components;

public class SunRoof {

    private boolean isSunRoofFitted;

    public SunRoof(boolean isSunRoofFitted) {
        this.isSunRoofFitted = isSunRoofFitted;
    }

    public boolean isSunRoofFitted() {
        return isSunRoofFitted;
    }

    public void setSunRoofFitted(boolean sunRoofFitted) {
        isSunRoofFitted = sunRoofFitted;
    }

    @Override
    public String toString() {
        return "SunRoof{" +
                "isSunRoofFitted=" + isSunRoofFitted +
                '}';
    }
}
