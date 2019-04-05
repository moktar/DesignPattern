package com.example.designpattern.behavioralpattern.mediatorpattern;

public class User1 extends Participant {

    private String name;
    private ApnaChatRoom chat;

    public User1(ApnaChatRoom chat) {
        this.chat = chat;
    }

    @Override
    public void sendMsg(String msg) {
        chat.showMsg(msg, this);
    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
