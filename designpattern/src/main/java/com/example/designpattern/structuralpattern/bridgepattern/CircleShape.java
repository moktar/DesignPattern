package com.example.designpattern.structuralpattern.bridgepattern;

public abstract class CircleShape {

    protected DrawAPI drawAPI;

    protected CircleShape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
