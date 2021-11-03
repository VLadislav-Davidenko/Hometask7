package com.company;

class Oven extends Multicooker {

    void initTimer(int time){
        System.out.println("Ожидайте " + time + " минут");
    }

    void cook() {
        System.out.println("Готовится");
    }

    @Override
    void powerOff() {
        System.out.println("Отключена и готова к охлождению");
    }
}

