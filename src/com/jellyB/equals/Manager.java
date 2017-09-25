package com.jellyB.equals;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 1:04.
 */
public class Manager extends Employee {

    private double bouns;

    public Manager(String name, double salary, int year, int month, int day) {

        super(name, salary, year, month, day);
        bouns = 0;
    }

    @Override
    public double getSalary() {

        double baseSalary = super.getSalary();

        return baseSalary + bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public boolean equals(Object otherObject) {

        Manager manager = (Manager) otherObject;

        return bouns == manager.bouns;
    }

    @Override
    public int hashCode() {

        return super.hashCode() + 17 * new Double(bouns).hashCode();
    }

    @Override
    public String toString() {

        return super.toString() + "[bouns=" + bouns + "]";
    }
}