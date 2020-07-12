package com.yurii.pos.devices;

public class Display implements IDisplay {
    @Override
    public void displayMessage(String message) {
        System.out.println("LaserPrinter: " + message);
    }
}
