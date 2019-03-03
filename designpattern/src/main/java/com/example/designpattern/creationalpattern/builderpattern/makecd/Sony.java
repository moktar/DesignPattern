package com.example.designpattern.creationalpattern.builderpattern.makecd;

public class Sony extends Company {
    @Override
    public int price() {
        return 20;
    }

    @Override
    public String pack() {
        return "Sony CD";
    }
}
