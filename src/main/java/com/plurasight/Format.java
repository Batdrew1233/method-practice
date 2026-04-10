package com.plurasight;

public class Format {
    public static void main(String[] args) {
        //Get first and last name
        String firstName = "Drew";
        String lastName = "Stevenson";

        //Call the static method and print
        String formatName = formatName(firstName, lastName);
        System.out.println(formatName);
    }

    //Static Method Format Name
    public static String formatName(String firstName, String lastName){
        String fullName = lastName + ", " + firstName;
        return fullName;
    }

}
