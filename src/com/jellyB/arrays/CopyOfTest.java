package com.jellyB.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-27.
 * Time: 0:53.
 */
public class CopyOfTest {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);
    }

    private static Object goodCopyOf(Object obj, int newLength) {

        Class<?> aClass = obj.getClass();

        if (!aClass.isArray()) return null;
        Class<?> componentType = aClass.getComponentType();
        int length = Array.getLength(obj);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(obj, 0, newArray, 0, Math.min(length, newLength));

        return newArray;
    }

    private static Object[] badCopyOf(Object[] obj, int newLength) {

        Object[] newArray = new Object[newLength];
        System.arraycopy(obj, 0, newArray, 0, Math.min(obj.length, newLength));

        return newArray;
    }
}