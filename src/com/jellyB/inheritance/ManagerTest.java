package com.jellyB.inheritance;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-21.
 * Time: 22:45.
 */
public class ManagerTest {

    public static void main(String[] args) {

        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1900, 3, 15);

        for (Employee e : staff) {

            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}