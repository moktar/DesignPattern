package com.example.designpattern.creationalpattern.builderpattern.makecd;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class CDType {

    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packs) {
        items.add(packs);
    }

    public void getCost() {
        for (Packing packs : items) {
            packs.price();
        }
    }

    public void showItems() {
        for (Packing packing : items) {
            Log.i("Make CD","CD name : " + packing.pack());
            Log.i("Make CD", ", Price : " + packing.price());
        }
    }
}
