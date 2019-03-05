package com.example.designpattern.creationalpattern.factorypattern;

import android.util.Log;

public class Square implements Shape {
    @Override
    public void draw() {
        Log.i("Shape","Inside Square::draw() method.");
    }
}
