package com.jellyB.javatests;

import java.time.LocalDate;

import static java.lang.System.out;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-21.
 * Time: 20:57.
 */
public class PackageTest {

    public static void main(String[] args) {

        PackageEmployee harry = new PackageEmployee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}

class PackageEmployee {

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

    public PackageEmployee(String name, double salary, int year, int month, int day) {

        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public void raiseSalary(double byPercent) {

        double raise = salary * byPercent / 100;
        salary += raise;
    }
}