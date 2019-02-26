package com.example.designpattern.creationalpattern.abstractfactorypattern;

public class SBI implements Bank {
    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
