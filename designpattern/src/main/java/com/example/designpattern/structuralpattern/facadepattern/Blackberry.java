package com.example.designpattern.structuralpattern.facadepattern;

import android.util.Log;

public class Blackberry implements MobileShop {

    @Override
    public void modelNo() {
        Log.i("Mobile Shop: "," Blackberry Z10 ");
    }
    @Override
    public void price() {
        Log.i("Mobile Shop: "," Rs 55000.00 ");
    }
}
