package com.jellyB.abstractClasses;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-25.
 * Time: 21:27.
 */
public abstract class Person {

    public abstract String getDescription();

    private String name;

    public Person(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}