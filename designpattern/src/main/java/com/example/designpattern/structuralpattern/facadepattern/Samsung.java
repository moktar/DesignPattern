package com.example.designpattern.structuralpattern.facadepattern;

import android.util.Log;

public class Samsung implements MobileShop {

    @Override
    public void modelNo() {
        Log.i("Mobile Shop: "," Samsung galaxy tab 3 ");
    }
    @Override
    public void price() {
        Log.i("Mobile Shop: "," Rs 45000.00 ");
    }
}
