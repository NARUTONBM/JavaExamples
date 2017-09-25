package com.jellyB.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 0:49.
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int year, int month, int day) {

        this.name = name;
        this.salary = salary;
        hireDate = LocalDate.of(year, month, day);
    }

    public String getName() {

        return name;
    }

    public double getSalary() {

        return salary;
    }

    public LocalDate getHireDate() {

        return hireDate;
    }

    public void raiseSalary(double byPercent) {

        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject) {

        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (getClass() != otherObject.getClass()) return false;

        Employee object = (Employee) otherObject;

        return Objects.equals(name, object.name) && salary == object.salary && Objects.equals(hireDate, object.hireDate);
    }
}