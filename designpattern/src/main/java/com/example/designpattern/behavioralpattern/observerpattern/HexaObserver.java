package com.example.designpattern.behavioralpattern.observerpattern;

import android.util.Log;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        Log.i("Change: ","Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
