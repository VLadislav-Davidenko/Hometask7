package com.company;

public class Main {

    public static void main(String[] args) {
        SmartPhone sm1 = new SmartPhone();
        sm1.runApp();
        sm1.call();
        sm1.sendMail("Маме отправить письмо");
        System.out.println("Отправить письмо Маме: " + sm1.createMail("Перзвони"));
        System.out.println("Исправленно: " + sm1.editMail("Перзвони !!!"));
        sm1.powerOff();
        System.out.println("===================");
        Mcooker mk1 = new Mcooker();
        mk1.switchProgram(7);
        mk1.cook();
        mk1.powerOff();
        System.out.println("===================");
        Oven ov1 = new Oven();
        ov1.initTimer(40);
        ov1.cook();
        ov1.powerOff();
        System.out.println("===================");
        DialPhone dp1 = new DialPhone();
        dp1.call();
        dp1.autoAnswer();
        dp1.powerOff();

    }
    



}
