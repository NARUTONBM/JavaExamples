package com.jellyB.javatests;

public class ParamTest {

    public static void main(String[] args) {

        System.out.println("\nTesting tripleSalary");
        ParamEmployee harry = new ParamEmployee("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());
    }

    private static void tripleSalary(ParamEmployee x) {

        x.raiseSalary(200);
        System.out.println("End of method: Salary=" + x.getSalary());
    }
}

class ParamEmployee {

    private String name;
    private double salary;

    public String getName() {

        return name;
    }

    double getSalary() {

        return salary;
    }

    ParamEmployee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    void raiseSalary(double byPercent) {

        double raise = salary * byPercent / 10;
        salary += raise;
    }
}