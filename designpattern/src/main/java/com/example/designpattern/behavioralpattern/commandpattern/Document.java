package com.example.designpattern.behavioralpattern.commandpattern;

import android.util.Log;

public class Document {

    public void open(){
        Log.i("Document: ","Document Opened");
    }
    public void save(){
        Log.i("Document: ","Document Saved");
    }
}
