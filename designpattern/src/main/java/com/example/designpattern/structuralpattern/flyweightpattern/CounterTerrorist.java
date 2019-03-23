package com.example.designpattern.structuralpattern.flyweightpattern;

import android.util.Log;

public class CounterTerrorist implements Player {

    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "DIFFUSE BOMB";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        Log.i("Player: ","Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}
