package com.jellyB.javatests;

import java.util.Random;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-20.
 * Time: 23:29.
 */
public class ConstructorTest {

    public static void main(String[] args) {

        ConstructorEmployee[] staff = new ConstructorEmployee[3];

        staff[0] = new ConstructorEmployee("Harry", 50000);
        staff[1] = new ConstructorEmployee(60000);
        staff[2] = new ConstructorEmployee();

        for (ConstructorEmployee ce : staff) {

            System.out.println("name=" + ce.getName() + ",id=" + ce.getId() + ",salary=" + ce.getSalary());
        }
    }
}

class ConstructorEmployee {

    private static int nextID;

    private int id;
    private String name = "";
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /*静态初始化块*/
    static {

        Random generator = new Random();
        //将0-9999之间的随机数赋给nextID
        nextID = generator.nextInt(10000);
    }

    /*对象初始化块*/ {

        id = nextID;
        nextID++;
    }

    /*默认构造器*/
    public ConstructorEmployee() {

        /*
        * name初始化为""
        * salary没有被初始化，默认值为0
        * id在初始化块中被初始化*/
    }

    public ConstructorEmployee(double employeeSalary) {

        //调用constructoremployee(name，salary)构造方法
        this("Employee #" + nextID, employeeSalary);
    }

    public ConstructorEmployee(String employeeName, double employeeSalary) {

        name = employeeName;
        salary = employeeSalary;
    }
}