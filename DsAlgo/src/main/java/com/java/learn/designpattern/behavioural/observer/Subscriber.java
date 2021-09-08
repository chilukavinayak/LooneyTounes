package com.java.learn.designpattern.behavioural.observer;

public class Subscriber {
    private String state;

    public Subscriber(String state){
        this.state = state;
    }

    public void update(String state){
        this.state = state;
    }

    public void print(){
        System.out.println(state);
    }
}
