package com.plurasight;

public class Format {
    public static void main(String[] args) {
        String firstName = "Drew";
        String lastName = "Stevenson";
        String formatName = formatName(firstName, lastName);
        System.out.println(formatName);

    }

    public static String formatName(String firstName, String lastName){
        String fullName = lastName + ", " + firstName;
        return fullName;
    }

}
