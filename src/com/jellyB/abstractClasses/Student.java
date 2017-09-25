package com.jellyB.abstractClasses;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 0:20.
 */
public class Student extends Person {

    private String major;

    public Student(String name, String major) {

        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {

        return "a student majoring in " + major;
    }
}