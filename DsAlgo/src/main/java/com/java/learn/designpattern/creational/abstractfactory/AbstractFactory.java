package com.java.learn.designpattern.creational.abstractfactory;

interface Button {
    void paint();
}

class WindowButton implements Button {
    public void paint() {
        System.out.println("Window Button drawn.");
    }
}

class MacButton implements Button {
    public void paint() {
        System.out.println("Mac Button drawn.");
    }
}

class LinuxButton implements Button {
    public void paint() {
        System.out.println("LInux Button drawn.");
    }
}

interface RadioButton {
    void paint();
}

class WindowRadioButton implements RadioButton {
    public void paint() {
        System.out.println("Window RadioButton drawn.");
    }
}

class MacRadioButton implements RadioButton {
    public void paint() {
        System.out.println("Mac RadioButton drawn.");
    }
}

class LinuxRadioButton implements RadioButton {
    public void paint() {
        System.out.println("Linux RadioButton drawn.");
    }
}


interface GUIFactory {
    Button createButton();

    RadioButton createRadioButton();
}


class WindowGUIFactory implements GUIFactory {
    public Button createButton() {
        return new WindowButton();
    }

    public RadioButton createRadioButton() {
        return new WindowRadioButton();
    }
}

class MacGUIFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public RadioButton createRadioButton() {
        return new MacRadioButton();
    }
}


class LinuxGUIFactory implements GUIFactory {
    public Button createButton() {
        return new LinuxButton();
    }

    public RadioButton createRadioButton() {
        return new LinuxRadioButton();
    }
}

class Client {
    public static void main(String[] args) {
        GUIFactory factory = new WindowGUIFactory();
        factory.createButton().paint();
        factory.createRadioButton().paint();

        factory = new MacGUIFactory();
        factory.createButton().paint();
        factory.createRadioButton().paint();

        factory = new LinuxGUIFactory();
        factory.createButton().paint();
        factory.createRadioButton().paint();
    }
}
}