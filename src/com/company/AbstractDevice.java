package com.company;

import java.lang.reflect.Array;

abstract class AbstractDevice {
    String name;
    int num;


    abstract void powerOn();
    abstract void powerOff();

    public AbstractDevice() {
        powerOn();
    }


}
