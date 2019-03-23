package com.example.designpattern.structuralpattern.facadepattern;

import android.util.Log;

public class Iphone implements MobileShop {
    @Override
    public void modelNo() {
        Log.i("Mobile Shop: "," Iphone 6 ");
    }
    @Override
    public void price() {
        Log.i("Mobile Shop: "," Rs 65000.00 ");
    }
}
