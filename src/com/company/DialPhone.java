package com.company;

class DialPhone extends Phone implements Caller{

    boolean hasAnswerphone;

    @Override
    void powerOn() {
        System.out.println("Вкл");
    }

    @Override
    void powerOff() {
        System.out.println("Выкл");
    }

    @Override
    public void call() {
        System.out.println("Вводим цифры и звоним");
    }

    void autoAnswer(){
        if (hasAnswerphone){
            System.out.println("Разговор");
        } else {
            System.out.println("Сейчас не могу ответить перезвоню позже");
        }
    }


}
