package com.company;

abstract class Multicooker extends AbstractDevice {

    @Override
    void powerOn() {
        System.out.println("Мультиварка включилась :) ");
    }

    @Override
    void powerOff() {
        System.out.println("Мультиварка выключилась :(");
    }

    abstract void cook();
}
