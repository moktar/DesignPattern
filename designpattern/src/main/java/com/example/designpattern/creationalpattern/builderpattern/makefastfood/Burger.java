package com.example.designpattern.creationalpattern.builderpattern.makefastfood;

public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
