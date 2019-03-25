package com.example.designpattern.behavioralpattern.chainofresponsibilitypattern;

import android.util.Log;

public class DebugBasedLogger extends Logger {

    public DebugBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        Log.i("Chain: ","DEBUG LOGGER INFO: " + msg);
    }
}
