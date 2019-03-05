package com.example.designpattern.structuralpattern.bridgepattern;

import android.util.Log;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.i("Draw Circle: ","Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");

    }
}
