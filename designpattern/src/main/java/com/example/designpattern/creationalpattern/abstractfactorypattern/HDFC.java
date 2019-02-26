package com.example.designpattern.creationalpattern.abstractfactorypattern;

public class HDFC implements Bank {

    private final String BNAME;

    public HDFC(){
        BNAME="HDFC BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
