package com.example.designpattern.behavioralpattern.observerpattern;

import android.util.Log;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        Log.i(" Change: ", "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
