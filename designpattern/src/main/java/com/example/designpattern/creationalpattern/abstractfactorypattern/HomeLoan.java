package com.example.designpattern.creationalpattern.abstractfactorypattern;

public class HomeLoan extends Loan {
    @Override
    public void getInterestRate(double r) {
        rate = r;

    }
}
