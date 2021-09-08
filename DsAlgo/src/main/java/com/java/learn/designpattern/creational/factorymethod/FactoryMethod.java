package com.java.learn.designpattern.creational.factorymethod;

import java.util.Scanner;

interface Button {
    void paint();
}
class WindowButton implements  Button{

    @Override
    public void paint() {
        System.out.println("WindowButton Painted");
    }
}
class LinuxButton implements  Button{

    @Override
    public void paint() {
        System.out.println("LinuxButton Painted");

    }
}
class MacButton implements  Button{

    @Override
    public void paint() {
        System.out.println("MacButton Painted");
    }
}
class Client{

    public static Button getButton(String type){

        if(type.compareToIgnoreCase("WINDOWS") == 0){
            return new WindowButton();
        }
        else if(type.compareToIgnoreCase("LINUX") == 0){
            return new LinuxButton();
        }
        else{
            return new MacButton();
        }
    }

    public static void main(String[] args) {

        Button button = getButton("Windows");
        button.paint();

        button = getButton("Linux");
        button.paint();

        button = getButton("Mac");
        button.paint();

    }
}