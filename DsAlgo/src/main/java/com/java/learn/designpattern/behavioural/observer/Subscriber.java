package com.java.learn.designpattern.behavioural.observer;


class Subject{

}

abstract class Observer{
    //me as (observer) interested in particular subject
    protected Subject subject;
    //update me any changes in interesed subject
    abstract protected void update();
}