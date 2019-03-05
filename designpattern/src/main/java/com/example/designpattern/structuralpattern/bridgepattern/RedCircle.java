package com.example.designpattern.structuralpattern.bridgepattern;

import android.util.Log;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.i("Draw Circle: ","Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");

    }
}
