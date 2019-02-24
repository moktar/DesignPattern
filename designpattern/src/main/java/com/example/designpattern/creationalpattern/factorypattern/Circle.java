package com.example.designpattern.creationalpattern.factorypattern;

import android.util.Log;

import com.example.designpattern.creationalpattern.factorypattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {

        Log.i("Shape","Inside Circle::draw() method.");
    }
}
