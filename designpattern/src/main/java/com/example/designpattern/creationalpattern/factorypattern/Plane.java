package com.example.designpattern.creationalpattern.factorypattern;

import android.util.Log;

public abstract class Plane {
    protected double rate;
    public abstract void getRate();

    public void calculateBill(int units){
        Log.i("Plane", String.valueOf(units*rate));
    }
}
