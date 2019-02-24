package com.example.designpattern.factorypattern;

import android.util.Log;

public class Circle implements Shape {
    @Override
    public void draw() {

        Log.i("Shape","Inside Circle::draw() method.");
    }
}
