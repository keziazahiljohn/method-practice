package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatName("Bob", "Casey"));
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
