package com.example.designpattern.creationalpattern.factorypattern;

import android.util.Log;

public class Rectangle implements Shape {
    @Override
    public void draw() {

        Log.i("Shape","Inside Rectangle::draw() method.");
    }
}
