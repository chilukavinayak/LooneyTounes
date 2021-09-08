package com.java.learn.designpattern.behavioural.observer;


import java.util.ArrayList;
import java.util.List;

class Subject{
    private int state = 9999; //default state
    private List<Observer> observers = new ArrayList<>();


    public void subscribe(Observer observer){
        observers.add(observer);
    }

    public boolean unsubscribe(Observer observer){
        return observers.remove(observer);
    }

    private void notifyThem(){
        for(Observer observer: observers){
            observer.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyThem();
    }
}

abstract class Observer{
    //me as (observer) interested in particular subject
    protected Subject subject;
    //update me any changes in interested subject
    abstract protected void update();
}

class BinaryObserver extends  Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
    }

    @Override
    protected void update() {
        System.out.println("BinaryObserver:  "+ subject.getState() + " : " + Integer.toBinaryString(subject.getState()) );
    }
}

class OctalObserver extends  Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
    }

    @Override
    protected void update() {
        System.out.println("OctalObserver:  "+ subject.getState() + " : " + Integer.toOctalString(subject.getState()) );
    }
}
class HexObserver extends  Observer{

    public HexObserver(Subject subject){
        this.subject = subject;
    }

    @Override
    protected void update() {
        System.out.println("HexObserver:  "+ subject.getState() + " : " + Integer.toHexString(subject.getState()) );
    }
}
class Client{
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer hexObserver = new HexObserver(subject);
        Observer octObserver = new OctalObserver(subject);
        Observer binaryObserver = new BinaryObserver(subject);

        subject.subscribe(hexObserver);
        subject.subscribe(octObserver);
        subject.subscribe(binaryObserver);

        //first change
        subject.setState(10);

        //second change
        subject.setState(15);
    }
}