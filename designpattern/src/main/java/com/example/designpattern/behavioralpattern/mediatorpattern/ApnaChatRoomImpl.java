package com.example.designpattern.behavioralpattern.mediatorpattern;

import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApnaChatRoomImpl implements ApnaChatRoom {

    //get current date time
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();

    @Override
    public void showMsg(String msg, Participant p) {

        Log.i("Chat: ",p.getName()+"'gets message: "+msg);
        Log.i("Chat: ","\t\t\t\t"+"["+dateFormat.format(date).toString()+"]");

    }
}
