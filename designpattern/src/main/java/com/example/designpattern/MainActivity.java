package com.example.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.designpattern.creationalpattern.abstractfactorypattern.AbstractFactory;
import com.example.designpattern.creationalpattern.abstractfactorypattern.Bank;
import com.example.designpattern.creationalpattern.abstractfactorypattern.FactoryCreator;
import com.example.designpattern.creationalpattern.abstractfactorypattern.Loan;
import com.example.designpattern.creationalpattern.factorypattern.GetPlaneFactory;
import com.example.designpattern.creationalpattern.factorypattern.Plane;
import com.example.designpattern.creationalpattern.factorypattern.Shape;
import com.example.designpattern.creationalpattern.factorypattern.ShapeFactory;
import com.example.designpattern.creationalpattern.prototypepattern.EmployeeRecord;
import com.example.designpattern.creationalpattern.singletonpattern.SingleObject;
import com.example.designpattern.creationalpattern.singletonpattern.Singleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Java creational design pattern
         */
        // test factory pattern
//        generateShapes();
//        makePlanes();
        // test abstract factory pattern
//        makeLoan();
        // test singleton pattern
//        createSingleObject();
//        createSingleInstance();
        // test prototype pattern
        clonePrototype();
    }

    private void clonePrototype() {
        EmployeeRecord e1=new EmployeeRecord(102, "Moktar Hossain", "Android Developer", 150000, "Dhaka");

        e1.showRecord();
        System.out.println("\n");

        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();
    }

    private void createSingleInstance() {
        //Get the only object available
        Singleton singleton = Singleton.getSingleton();

        //show the message
        singleton.doSomething();
    }

    private void createSingleObject() {
        //Get the only object available
        SingleObject object = SingleObject.getSingleObject();

        //show the message
        object.doSomething();
    }

    private void makeLoan() {
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank("ICICI"); // ICICI/SBI/HDFC
        Log.i("Bank", "The name of the bank: " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan("Home"); // Home/Business/Education
        l.getInterestRate(12.9);
        l.calculateLoanPayment(500000, 5);
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
        Shape shape1 = (Shape) shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = (Shape) shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = (Shape) shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}
