package com.example.designpattern.behavioralpattern.statepattern;

import android.util.Log;

public class Sales implements Connection {

    @Override
    public void open() {
        Log.i("State: ","open database for accounting");
    }
    @Override
    public void close() {
        Log.i("State: ","close the database");
    }

    @Override
    public void log() {
        Log.i("State: ","log activities");
    }

    @Override
    public void update() {
        Log.i("State: ","Sales has been updated");
    }
}
