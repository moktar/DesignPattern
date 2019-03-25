package com.example.designpattern.behavioralpattern.chainofresponsibilitypattern;

import android.util.Log;

public class ErrorBasedLogger extends Logger {

    public ErrorBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        Log.i("Chain: ","ERROR LOGGER INFO: " + msg);
    }
}
