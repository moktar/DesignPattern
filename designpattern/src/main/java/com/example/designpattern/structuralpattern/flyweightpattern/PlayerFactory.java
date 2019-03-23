package com.example.designpattern.structuralpattern.flyweightpattern;

import android.util.Log;

import java.util.HashMap;

public class PlayerFactory {

    /* HashMap stores the reference to the object
       of Terrorist(TS) or CounterTerrorist(CT).  */
    private static HashMap<String, Player> hm = new HashMap<>();

    // Method to get a player
    public static Player getPlayer(String type) {
        Player p = null;

        /* If an object for TS or CT has already been
           created simply return its reference */
        if (hm.containsKey(type))
            p = hm.get(type);
        else {
            /* create an object of TS/CT  */
            switch (type) {
                case "Terrorist":
                    Log.i("Player: ","Terrorist Created");
                    p = new Terrorist();
                    break;
                case "CounterTerrorist":
                    Log.i("Player: ","Counter Terrorist Created");
                    p = new CounterTerrorist();
                    break;
                default:
                    Log.i("Player: ","Unreachable code!");
            }

            // Once created insert it into the HashMap
            hm.put(type, p);
        }
        return p;
    }
}
