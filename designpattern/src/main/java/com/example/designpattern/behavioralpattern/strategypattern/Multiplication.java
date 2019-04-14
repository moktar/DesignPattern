package com.example.designpattern.behavioralpattern.strategypattern;

public class Multiplication implements Strategy {

    @Override
    public float calculation(float a, float b) {
        return a * b;
    }
}
