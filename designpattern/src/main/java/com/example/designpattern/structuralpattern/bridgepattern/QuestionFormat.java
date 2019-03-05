package com.example.designpattern.structuralpattern.bridgepattern;

import android.util.Log;

public class QuestionFormat extends QuestionManager {
    public QuestionFormat(String catalog) {
        super(catalog);
    }

    public void displayAll() {
        Log.i("Question: ","\n---------------------------------------------------------");
        super.displayAll();
        Log.i("Question: ","-----------------------------------------------------------");
    }
}
