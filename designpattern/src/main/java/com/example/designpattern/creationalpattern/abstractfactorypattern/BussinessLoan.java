package com.example.designpattern.creationalpattern.abstractfactorypattern;

public class BussinessLoan extends Loan {
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
