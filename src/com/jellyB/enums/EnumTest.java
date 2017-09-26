package com.jellyB.enums;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 19:12.
 */
public class EnumTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = scanner.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbreviation());

        if (size == Size.SMALL) System.out.println("Good job--you paid attention to the _.");
    }
}