package com.jellyB.arrayList;

import com.jellyB.equals.Employee;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 19:06.
 */
public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Employee> staffs = new ArrayList<>();

        staffs.add(new Employee("Carl", 75000, 1987, 12, 15));
        staffs.add(new Employee("Hank", 50000, 1989, 10, 1));
        staffs.add(new Employee("Tony", 40000, 1990, 3, 15));

        for (Employee e : staffs) {

            e.raiseSalary(5);
        }

        for (Employee e : staffs) {

            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDate = " + e.getHireDate());
        }
    }
}