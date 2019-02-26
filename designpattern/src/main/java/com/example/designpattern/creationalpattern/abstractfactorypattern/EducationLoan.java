package com.example.designpattern.creationalpattern.abstractfactorypattern;

public class EducationLoan extends Loan {
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
