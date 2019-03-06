package com.example.designpattern.structuralpattern.compositepattern;

import android.util.Log;

public class Cashier implements Employee {

    /**
     * In this class,there are many methods which are not applicable to cashier because
     * it is a leaf node.
     */
    private int id;
    private String name;
    private double salary;

    public Cashier(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void add(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    @Override
    public void remove(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }

    @Override
    public Employee getChild(int i) {
        //this is leaf node so this method is not applicable to this class.
        return null;
    }

    @Override
    public void print() {
        Log.i("Employee:", "==========================");
        Log.i("Employee:", "Id =" + getId());
        Log.i("Employee:", "Name =" + getName());
        Log.i("Employee:", "Salary =" + getSalary());
        Log.i("Employee:", "==========================");
    }

}
