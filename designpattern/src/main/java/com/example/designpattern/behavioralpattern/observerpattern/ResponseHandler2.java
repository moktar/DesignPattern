package com.example.designpattern.behavioralpattern.observerpattern;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler2 implements Observer {
    private String resp;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            Log.i("Observed: ","\nReceived Response: " + resp );
        }
    }
}
