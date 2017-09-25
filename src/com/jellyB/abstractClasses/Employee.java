package com.jellyB.abstractClasses;

import java.time.LocalDate;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-25.
 * Time: 21:30.
 */
public class Employee extends Person {

    private double salary;
    private LocalDate hireDate;


    public Employee(String name, double salary, int year, int month, int day) {

        super(name);
        this.salary = salary;
        hireDate = LocalDate.of(year, month, day);
    }

    public double getSalary() {

        return salary;
    }

    public LocalDate getHireDate() {

        return hireDate;
    }

    public String getDescription() {

        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent) {

        double raise = salary * byPercent / 100;
        salary += raise;
    }
}