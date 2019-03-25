package com.example.designpattern.behavioralpattern.chainofresponsibilitypattern;

import android.util.Log;

public class ConsoleBasedLogger extends Logger {

    public ConsoleBasedLogger(int levels) {
        this.levels=levels;
    }


    @Override
    protected void displayLogInfo(String msg) {
        Log.i("Chain: ","CONSOLE LOGGER INFO: " + msg);
    }
}
