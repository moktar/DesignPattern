package com.example.designpattern.creationalpattern.singletonpattern;

import android.util.Log;

public class SingleObject {

    private static SingleObject singleObject;
    private SingleObject(){}

    public static SingleObject getSingleObject(){
        if (singleObject == null){
            synchronized(Singleton.class){
                if (singleObject == null){
                    singleObject = new SingleObject();//instance will be created at request time
                }
            }
        }
        return singleObject;
    }

    public void doSomething(){
        //write your code
        Log.i("Singleton: ", "instance of the class is created when required.");
    }
}
