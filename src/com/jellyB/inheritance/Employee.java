package com.jellyB.inheritance;

import java.time.LocalDate;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-21.
 * Time: 22:16.
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public String getName() {

        return name;
    }

    public double getSalary() {

        return salary;
    }

    public LocalDate getHireDay() {

        return hireDay;
    }

    public Employee(String name, double salary, int year, int month, int day) {

        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public void raiseSalary(double byPercent) {

        double raise = salary * byPercent / 100;
        salary += raise;
    }
}