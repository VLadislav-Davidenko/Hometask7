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
        System.out.println("===================");
        AbstractDevice[] abs = new AbstractDevice[]{sm1, mk1, ov1, dp1};
        alloff(abs);
        Post pst1 = new Post();
        MailSender[] arguments = new MailSender[]{sm1, pst1};
        allsend(arguments);
    }


    public static void alloff(AbstractDevice[] varargs) {
        for (AbstractDevice vararg : varargs) {
            vararg.powerOff();
        }

    }

    public static void allsend(MailSender[]  varargs) {
        for (MailSender vararg : varargs) {
            vararg.sendMail("Это Спам");
        }


    }
}
