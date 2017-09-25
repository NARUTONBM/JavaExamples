package com.jellyB.abstractClasses;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 0:38.
 */
public class PersonTest {

    public static void main(String[] args) {

        Person[] people = new Person[2];
        people[0] = new Employee("harry", 50000, 1989, 10, 1);
        people[1] = new Student("Maris", "computer science");

        for (Person p : people) {

            System.out.println(p.getName() + "," + p.getDescription());
        }
    }
}