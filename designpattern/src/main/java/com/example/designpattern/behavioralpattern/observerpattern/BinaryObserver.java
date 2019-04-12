package com.example.designpattern.behavioralpattern.observerpattern;

import android.util.Log;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
       Log.i("Event Change: ", "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
