package com.example.designpattern.behavioralpattern.commandpattern;

import android.util.Log;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        Log.i("Stock: ","Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        Log.i("Stock: ","Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
