package com.example.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.designpattern.creationalpattern.abstractfactorypattern.AbstractFactory;
import com.example.designpattern.creationalpattern.abstractfactorypattern.Bank;
import com.example.designpattern.creationalpattern.abstractfactorypattern.FactoryCreator;
import com.example.designpattern.creationalpattern.abstractfactorypattern.Loan;
import com.example.designpattern.creationalpattern.builderpattern.makecd.CDBuilder;
import com.example.designpattern.creationalpattern.builderpattern.makecd.CDType;
import com.example.designpattern.creationalpattern.builderpattern.makefastfood.Meal;
import com.example.designpattern.creationalpattern.builderpattern.makefastfood.MealBuilder;
import com.example.designpattern.creationalpattern.factorypattern.GetPlaneFactory;
import com.example.designpattern.creationalpattern.factorypattern.Plane;
import com.example.designpattern.creationalpattern.factorypattern.Shape;
import com.example.designpattern.creationalpattern.factorypattern.ShapeFactory;
import com.example.designpattern.creationalpattern.objectpoolpattern.ObjectPoolDemo;
import com.example.designpattern.creationalpattern.prototypepattern.EmployeeRecord;
import com.example.designpattern.creationalpattern.singletonpattern.SingleObject;
import com.example.designpattern.creationalpattern.singletonpattern.Singleton;
import com.example.designpattern.structuralpattern.adapterpattern.AudioPlayer;
import com.example.designpattern.structuralpattern.adapterpattern.BankCustomer;
import com.example.designpattern.structuralpattern.adapterpattern.CreditCard;
import com.example.designpattern.structuralpattern.bridgepattern.Circle;
import com.example.designpattern.structuralpattern.bridgepattern.CircleShape;
import com.example.designpattern.structuralpattern.bridgepattern.GreenCircle;
import com.example.designpattern.structuralpattern.bridgepattern.JavaQuestions;
import com.example.designpattern.structuralpattern.bridgepattern.QuestionFormat;
import com.example.designpattern.structuralpattern.bridgepattern.RedCircle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * To view output of these design pattern select logcat tab then select info from dropdown menu
         * and search the specific log tag name.
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
//        clonePrototype();
        // test builder pattern
//        makeFastFood();
//        makeCD();
        // test object pool pattern
//        executeObjectPool();
        /**
         * Java structural design pattern
         */
        // test adapter pattern
//        getCustomerDetails();
//        playAudioPlayer();
        // test bridge pattern
        drawCircle();
        makeQuestion();
    }

    private void makeQuestion() {
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.q = new JavaQuestions();
        questions.delete("what is class?");
        questions.display();
        questions.newOne("What is inheritance? ");

        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();
    }

    private void drawCircle() {
        CircleShape redCircle = new Circle(100,100, 10, new RedCircle());
        CircleShape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

    private void playAudioPlayer() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

    private void getCustomerDetails() {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        Log.i("Customer Details: ", targetInterface.getCreditCard());
    }

    private void executeObjectPool() {
        ObjectPoolDemo op=new ObjectPoolDemo();
        op.setUp();
        op.tearDown();
        op.testObjectPool();
    }

    private void makeCD() {
        CDBuilder cdBuilder=new CDBuilder();
        CDType cdType1=cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2=cdBuilder.buildSamsungCD();
        cdType2.showItems();
    }

    private void makeFastFood() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        Log.i("Fast Food: ", "Veg Meal");
        vegMeal.showItems();
        Log.i("Fast Food: ", "Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        Log.i("Fast Food: ", "\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        Log.i("Fast Food: ", "Total Cost: " + nonVegMeal.getCost());

    }

    private void clonePrototype() {
        EmployeeRecord e1 = new EmployeeRecord(102, "Moktar Hossain", "Android Developer", 150000, "Dhaka");

        e1.showRecord();
        System.out.println("\n");

        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
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
        Loan l = loanFactory.getLoan("Home"); // Home/Business/Education
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
