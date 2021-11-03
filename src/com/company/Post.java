package com.company;

public class Post implements MailSender{


    @Override
    public String createMail(String post) {
        return post;
    }

    @Override
    public void sendMail(String sender) {
        System.out.println("Это Спам");
    }
}
