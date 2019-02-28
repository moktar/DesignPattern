package com.example.designpattern.creationalpattern.singletonpattern;

import android.util.Log;

public class Singleton {
    private static Singleton singleton = new Singleton();//Early, instance will be created at load time
    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }

    public void doSomething(){
        //write your code
        Log.i("Singleton: ", "instance of the class is created at the time of classloading.");
    }
}
