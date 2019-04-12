package com.example.designpattern.behavioralpattern.observerpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable{

    private String msg;

    public EventSource(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        /*try {
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);
            while (true) {
                String response = br.readLine();
                setChanged();
                notifyObservers(response);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }*/

        setChanged();
        notifyObservers(msg);
    }
}
