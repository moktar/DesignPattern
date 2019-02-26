package com.example.designpattern.creationalpattern.abstractfactorypattern;

public class ICICI implements Bank {

    private final String BNAME;
    ICICI(){
        BNAME="ICICI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
