package com.jellyB.enums;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 19:23.
 */
public enum Size {

    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    Size(String abbreviation) {

        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {

        return abbreviation;
    }
}