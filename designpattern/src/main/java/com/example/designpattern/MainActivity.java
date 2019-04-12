package com.example.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.designpattern.behavioralpattern.chainofresponsibilitypattern.ConsoleBasedLogger;
import com.example.designpattern.behavioralpattern.chainofresponsibilitypattern.DebugBasedLogger;
import com.example.designpattern.behavioralpattern.chainofresponsibilitypattern.ErrorBasedLogger;
import com.example.designpattern.behavioralpattern.chainofresponsibilitypattern.Logger;
import com.example.designpattern.behavioralpattern.commandpattern.ActionListernerCommand;
import com.example.designpattern.behavioralpattern.commandpattern.ActionOpen;
import com.example.designpattern.behavioralpattern.commandpattern.ActionSave;
import com.example.designpattern.behavioralpattern.commandpattern.Broker;
import com.example.designpattern.behavioralpattern.commandpattern.BuyStock;
import com.example.designpattern.behavioralpattern.commandpattern.Document;
import com.example.designpattern.behavioralpattern.commandpattern.MenuOptions;
import com.example.designpattern.behavioralpattern.commandpattern.SellStock;
import com.example.designpattern.behavioralpattern.commandpattern.Stock;
import com.example.designpattern.behavioralpattern.interpreterpattern.AndExpression;
import com.example.designpattern.behavioralpattern.interpreterpattern.Expression;
import com.example.designpattern.behavioralpattern.interpreterpattern.InfixToPostfixPattern;
import com.example.designpattern.behavioralpattern.interpreterpattern.OrExpression;
import com.example.designpattern.behavioralpattern.interpreterpattern.TerminalExpression;
import com.example.designpattern.behavioralpattern.iteratorpattern.CollectionOfNames;
import com.example.designpattern.behavioralpattern.iteratorpattern.Iterator;
import com.example.designpattern.behavioralpattern.mediatorpattern.ApnaChatRoom;
import com.example.designpattern.behavioralpattern.mediatorpattern.ApnaChatRoomImpl;
import com.example.designpattern.behavioralpattern.mediatorpattern.User1;
import com.example.designpattern.behavioralpattern.mediatorpattern.User2;
import com.example.designpattern.behavioralpattern.mementopattern.Caretaker;
import com.example.designpattern.behavioralpattern.mementopattern.Originator;
import com.example.designpattern.behavioralpattern.observerpattern.BinaryObserver;
import com.example.designpattern.behavioralpattern.observerpattern.EventSource;
import com.example.designpattern.behavioralpattern.observerpattern.HexaObserver;
import com.example.designpattern.behavioralpattern.observerpattern.OctalObserver;
import com.example.designpattern.behavioralpattern.observerpattern.ResponseHandler1;
import com.example.designpattern.behavioralpattern.observerpattern.ResponseHandler2;
import com.example.designpattern.behavioralpattern.observerpattern.Subject;
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
import com.example.designpattern.structuralpattern.compositepattern.Accountant;
import com.example.designpattern.structuralpattern.compositepattern.BankManager;
import com.example.designpattern.structuralpattern.compositepattern.Cashier;
import com.example.designpattern.structuralpattern.compositepattern.Employee;
import com.example.designpattern.structuralpattern.decoratorpattern.ChineeseFood;
import com.example.designpattern.structuralpattern.decoratorpattern.Food;
import com.example.designpattern.structuralpattern.decoratorpattern.NonVegFood;
import com.example.designpattern.structuralpattern.decoratorpattern.VegFood;
import com.example.designpattern.structuralpattern.facadepattern.ShopKeeper;
import com.example.designpattern.structuralpattern.flyweightpattern.Player;
import com.example.designpattern.structuralpattern.flyweightpattern.PlayerFactory;
import com.example.designpattern.structuralpattern.proxypattern.OfficeInternetAccess;
import com.example.designpattern.structuralpattern.proxypattern.ProxyInternetAccess;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // All player types and weopons (used by getRandPlayerType()
    // and getRandWeapon()
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * To view output of these design pattern select logcat tab then select info from dropdown menu
         * and search the specific log tag name.
         */

        /**
         * Creational design pattern
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
         * Structural design pattern
         */
        // test adapter pattern
//        getCustomerDetails();
//        playAudioPlayer();

        // test bridge pattern
//        drawCircle();
//        makeQuestion();

        // test composite pattern
//        getEmployeeDetails();

        // test decorator pattern
//        makeFood();

        // test facade pattern
//        purchsedMobilePhone();

        // test flyweight pattern
//        playGame();

        // test proxy pattern
//        accessInternet();

        /**
         * Behavioral design pattern
         */
        // test chain of responsibility pattern
//        viewLogInfo();

        // test command pattern
//        executeDocument();
//        executeStock();

        // test interpreter pattern
//        interpreted();
//        translated();

        // test iterator pattern
//        getNames();

        // test mediator pattern
//        displayMessage();

        // test memento pattern
//        doMemento();

        // test observer pattern
//        createObserver();
        createObserver2();
    }

    private void createObserver2() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        Log.i("Change: ","First state change: 15");
        subject.setState(15);
        Log.i("Change: ","Second state change: 10");
        subject.setState(10);
    }

    private void createObserver() {
        // create an event source - reads from stdin
        final EventSource eventSource = new EventSource("Change the text as your wish to change the event");// Observer has been changed

        // create first observer
        final ResponseHandler1 responseHandler1 = new ResponseHandler1();

        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler1);


        // create second observer
        final ResponseHandler2 responseHandler2 = new ResponseHandler2();

        // subscribe the observer to the event source
        eventSource.addObserver(responseHandler2);

        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
    }

    private void doMemento() {
        Originator originator = new Originator();

        Caretaker careTaker = new Caretaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        Log.i("Memento: ","Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        Log.i("Memento: ","First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        Log.i("Memento: ","Second saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(2));
        Log.i("Memento: ","Third saved State: " + originator.getState());
    }

    private void displayMessage() {
        ApnaChatRoom chat = new ApnaChatRoomImpl();

        User1 u1=new User1(chat);
        u1.setname("Moktar Hossain");
        u1.sendMsg("Hi Razzak! how are you?");


        User2 u2=new User2(chat);
        u2.setname("Mamun Rashid");
        u2.sendMsg("I am Fine ! You tell?");
    }

    private void getNames() {
        CollectionOfNames cmpnyRepository = new CollectionOfNames();
        for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            Log.i("Person: ","Name : " + name);
        }
    }

    private void translated() {

        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Log.i("Translated: ", "John is male? " + isMale.interpret("John"));
        Log.i("Translated: ", "Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

    //Rule: Robert and John are male
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    private void interpreted() {

        String infix = "a+b*c";

        InfixToPostfixPattern ip = new InfixToPostfixPattern();

        String postfix = ip.conversion(infix);
        Log.i("Interpreted: ", "Infix:   " + infix);
        Log.i("Interpreted: ", "Postfix: " + postfix);
    }

    private void executeStock() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

    private void executeDocument() {
        Document doc = new Document();

        ActionListernerCommand clickOpen = new ActionOpen(doc);
        ActionListernerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }

    private void viewLogInfo() {
        Logger chainLogger = doChaining();
        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
    }

    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    private void accessInternet() {
        OfficeInternetAccess access = new ProxyInternetAccess("Moktar Hossain");
        access.grantInternetAccess();
    }

    private void playGame() {
        /* Assume that we have a total of 10 players
           in the game. */
        for (int i = 0; i < 10; i++) {
            /* getPlayer() is called simply using the class
               name since the method is a static one */
            Player p = PlayerFactory.getPlayer(getRandPlayerType());

            /* Assign a weapon chosen randomly uniformly
               from the weapon array  */
            p.assignWeapon(getRandWeapon());

            // Send this player on a mission
            p.mission();
        }
    }

    // Utility methods to get a random player type and
    // weapon
    public String getRandPlayerType() {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }

    public String getRandWeapon() {
        Random r = new Random();

        // Will return an integer between [0,5)
        int randInt = r.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }

    private void purchsedMobilePhone() {
        Log.i("Mobile Shop: ", "========= Mobile Shop ============ \n");
        Log.i("Mobile Shop: ", "            1. IPHONE.              \n");
        Log.i("Mobile Shop: ", "            2. SAMSUNG.              \n");
        Log.i("Mobile Shop: ", "            3. BLACKBERRY.            \n");
        Log.i("Mobile Shop: ", "            4. Exit.                     \n");
        Log.i("Mobile Shop: ", "Enter your choice: ");

        ShopKeeper sk = new ShopKeeper();
        int choice = 1; // change the values for different tested like as 1/2/3
        switch (choice) {
            case 1: {
                sk.iphoneSale();
            }
            break;
            case 2: {
                sk.samsungSale();
            }
            break;
            case 3: {
                sk.blackberrySale();
            }
            break;
            default: {
                System.out.println("Nothing You purchased");
            }
        }
    }

    private void makeFood() {
        Log.i("Food: ", "========= Food Menu ============ \n");
        Log.i("Food: ", "            1. Vegetarian Food.   \n");
        Log.i("Food: ", "            2. Non-Vegetarian Food.\n");
        Log.i("Food: ", "            3. Chineese Food.         \n");
        Log.i("Food: ", "            4. Exit                        \n");

        int choice = 1; // change the  value 1/2/3
        switch (choice) {
            case 1: {
                VegFood vf = new VegFood();
                Log.i("Food: ", vf.prepareFood());
                Log.i("Food: ", String.valueOf(vf.foodPrice()));
            }
            break;
            case 2: {
                Food f1 = new NonVegFood((Food) new VegFood());
                Log.i("Food: ", f1.prepareFood());
                Log.i("Food: ", String.valueOf(f1.foodPrice()));
            }
            case 3: {
                Food f2 = new ChineeseFood((Food) new VegFood());
                Log.i("Food: ", f2.prepareFood());
                Log.i("Food: ", String.valueOf(f2.foodPrice()));
            }
            break;

            default: {
                Log.i("Food: ", "Other than these no food available");
            }
        }
    }

    private void getEmployeeDetails() {
        Employee emp1 = new Cashier(101, "Sohan Kumar", 20000.0);
        Employee emp2 = new Cashier(102, "Mohan Kumar", 25000.0);
        Employee emp3 = new Accountant(103, "Seema Mahiwal", 30000.0);
        Employee manager1 = new BankManager(100, "Ashwani Rajput", 100000.0);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();

        manager1.getChild(1);
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
        CircleShape redCircle = new Circle(100, 100, 10, new RedCircle());
        CircleShape greenCircle = new Circle(100, 100, 10, new GreenCircle());

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
        ObjectPoolDemo op = new ObjectPoolDemo();
        op.setUp();
        op.tearDown();
        op.testObjectPool();
    }

    private void makeCD() {
        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildSamsungCD();
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
