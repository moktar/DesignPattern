package com.example.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.designpattern.creationalpattern.factorypattern.GetPlaneFactory;
import com.example.designpattern.creationalpattern.factorypattern.Plane;
import com.example.designpattern.creationalpattern.factorypattern.Shape;
import com.example.designpattern.creationalpattern.factorypattern.ShapeFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Java creational design pattern
         */
        // test factory pattern
        generateShapes();
        makePlanes();
    }

    private void makePlanes() {
        GetPlaneFactory planeFactory = new GetPlaneFactory();

        //get an object of Commercial Plane and call its  getRate() method and calculateBill()method.
        Plane plane = planeFactory.getPlan("DOMESTICPLANE"); // DOMESTICPLANE/COMMERCIALPLANE/INSTITUTIONALPLANE
        Log.i("PLane", "Bill amount for " + plane + " of  " + 500 + " units is: ");
        //call getRate() method and calculateBill()method
        plane.getRate();
        plane.calculateBill(500);

    }

    private void generateShapes() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}
