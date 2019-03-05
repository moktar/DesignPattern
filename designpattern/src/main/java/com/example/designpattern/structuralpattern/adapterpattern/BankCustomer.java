package com.example.designpattern.structuralpattern.adapterpattern;

public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        setAccHolderName("Moktar Hossain");
        setAccNumber(125625933322l);
        setBankName("Dutch Bangla Bank");
    }

    @Override
    public String getCreditCard() {
        long accno=getAccNumber();
        String accholdername=getAccHolderName();
        String bname=getBankName();

        return ("The Account number "+accno+" of "+accholdername+" in "+bname+
                "bank is valid and authenticated for issuing the credit card. ");
    }
}
