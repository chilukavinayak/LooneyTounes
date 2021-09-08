package com.java.learn.designpattern.behavioural.observer;

class Subscriber {
    private String state;

    public Subscriber(String state){
        this.state = state;
    }

    public void notify(String state){
        this.state = state;
    }

    public void print(){
        System.out.println(state);
    }
}

class Observer