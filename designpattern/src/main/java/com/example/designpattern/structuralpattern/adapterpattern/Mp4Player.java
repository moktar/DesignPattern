package com.example.designpattern.structuralpattern.adapterpattern;

import android.util.Log;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        Log.i("Media Player: ","Playing mp4 file. Name: "+ fileName);
    }
}
