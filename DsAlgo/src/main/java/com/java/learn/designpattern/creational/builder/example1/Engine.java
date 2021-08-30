package com.java.learn.designpattern.creational.builder.example1;


/*
*
*
* 4-cylinder, 3-cylinder, etc. ...
Displacement - Eg. ...
5-speed transmission, 6-speed transmission, etc. ...
Power - For Eg. ...
Torque - Eg. ...
Drivetrain. ...
Suspensio
* */
public class Engine {

    private int numberCylinder;
    private int Tranmission;
    private int power;
    private int torque;

    public Engine() {
    }

    public Engine(int numberCylinder, int tranmission, int power, int torque) {
        this.numberCylinder = numberCylinder;
        Tranmission = tranmission;
        this.power = power;
        this.torque = torque;
    }

    public int getNumberCylinder() {
        return numberCylinder;
    }

    public void setNumberCylinder(int numberCylinder) {
        this.numberCylinder = numberCylinder;
    }

    public int getTranmission() {
        return Tranmission;
    }

    public void setTranmission(int tranmission) {
        Tranmission = tranmission;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }
}
