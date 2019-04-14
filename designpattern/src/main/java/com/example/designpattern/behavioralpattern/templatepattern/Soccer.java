package com.example.designpattern.behavioralpattern.templatepattern;

import android.util.Log;

public class Soccer extends Game {

    @Override
    void initialize() {
        Log.i("Play: ","Soccer Game Initialized! Start playing.");
    }

    @Override
    void start() {
        Log.i("Play: ","Game Started. Welcome to in the Soccer game!");
    }

    @Override
    void end() {
        Log.i("Play: ","Game Finished!");
    }
}
