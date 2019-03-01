package com.example.designpattern.creationalpattern.prototypepattern;

import android.util.Log;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord(){
        Log.i("Clone: ", "   Employee Records of Oracle Corporation ");
        Log.i("Clone: ", "---------------------------------------------");
        Log.i("Clone: ", "Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");

    }

    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {

        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){

        Log.i("Clone: ",id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
    }

    @Override
    public Prototype getClone() {
        return new  EmployeeRecord(id,name,designation,salary,address);
    }
}
