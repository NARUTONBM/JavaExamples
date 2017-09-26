package com.jellyB.objectAnalyzer;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 23:19.
 */
public class ObjectAnalyzerTest {

    public static void main(String[] args) {

        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}