package com.example.designpattern.structuralpattern.flyweightpattern;

import android.util.Log;

public class Terrorist implements Player {

    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    public void assignWeapon(String weapon) {
        // Assign a weapon
        this.weapon = weapon;
    }

    public void mission() {
        //Work on the Mission
        Log.i("Player: ","Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}
