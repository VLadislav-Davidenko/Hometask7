package com.company;

class Mobile extends Phone{

    int simCount = 2;
    String display = "LED";


    @Override
    void powerOn() {
        System.out.println("Мобильник врубился");
    }

    @Override
    void powerOff() {
        System.out.println("Мобильник c " + simCount + " Симками и с " + display + " дисплеем вырубился ");
    }

    @Override
    void call() {
        System.out.println("Звоню маме");
        System.out.println("Конец разговора ");
    }
}
