package com.jellyB.javatests;

public class ParamTest {

    public static void main(String[] args) {

        System.out.println("\nTesting tripleSalary");
        ParamEmployee harry = new ParamEmployee("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry, 200);
        System.out.println("After: salary=" + harry.getSalary());
    }

    /**
     * @param x         雇员
     * @param byPercent 提升比例
     */
    private static void tripleSalary(ParamEmployee x, double byPercent) {

        x.raiseSalary(byPercent);
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

    /**
     * @param name   雇员姓名
     * @param salary 雇员薪水
     */
    ParamEmployee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    void raiseSalary(double byPercent) {

        double raise = salary * byPercent / 10;
        salary += raise;
    }
}