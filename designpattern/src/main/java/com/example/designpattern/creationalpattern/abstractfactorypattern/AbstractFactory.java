package com.example.designpattern.creationalpattern.abstractfactorypattern;

public abstract class AbstractFactory {

    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
