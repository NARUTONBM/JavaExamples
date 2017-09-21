package com.jellyB.inheritance;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-21.
 * Time: 22:24.
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {

        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {

        double baseSalary = super.getSalary();

        return baseSalary + bonus;
    }

    public void setBonus(double b) {

        bonus = b;
    }
}