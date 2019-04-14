package com.example.designpattern.behavioralpattern.templatepattern;

import android.util.Log;

public class Chess extends Game {

    @Override
    void initialize() {
        Log.i("Play: ","Chess Game Initialized! Start playing.");
    }
    @Override
    void start() {
        Log.i("Play: ","Game Started. Welcome to in the chess game!");
    }
    @Override
    void end() {
        Log.i("Play: ","Game Finished!");
    }
}
