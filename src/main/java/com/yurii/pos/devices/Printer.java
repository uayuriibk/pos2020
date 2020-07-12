package com.yurii.pos.devices;

public class Printer implements IPrinter {
    @Override
    public void printMessage(String message) {
        System.out.println("LaserPrinter: " + message);
    }
}
