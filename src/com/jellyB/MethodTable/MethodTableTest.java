package com.jellyB.MethodTable;

import java.lang.reflect.*;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-27.
 * Time: 1:09.
 */
public class MethodTableTest {

    public static void main(String[] args) throws Exception {

        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    public static double square(double x) {

        return x * x;
    }

    private static void printTable(double from, double to, int n, Method method) {

        System.out.println(method);

        double dx = (to - from) / (n - 1);
        for (double x = from; x <= to; x += dx) {

            try {
                Double y = (Double) method.invoke(null, x);
                System.out.printf("%10.4f | %10.4f%n", x, y);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }
    }
}