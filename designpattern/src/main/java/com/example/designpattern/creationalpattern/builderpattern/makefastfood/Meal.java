package com.example.designpattern.creationalpattern.builderpattern.makefastfood;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        for (Item item : items) {
            Log.i("Fast Food: ","Item : " + item.name()+", Packing : " + item.packing().pack()+", Price : " + item.price());
        }
    }
}
