package com.company;

public class SmartPhone extends Mobile implements Caller, EmailSender {
    String os;

    void runApp(){
        System.out.println("Запускаем список номеров");
    }


    @Override
    public void call() {
        System.out.println("Звоним Маме");
    }

    @Override
    public String editMail(String correct) {
        return correct;
    }

    @Override
    public String createMail(String post) {
        return post;
    }

    @Override
    public void sendMail(String sender) {
        System.out.println(sender);
    }
}
