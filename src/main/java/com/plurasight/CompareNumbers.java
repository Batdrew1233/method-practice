package com.plurasight;

public class CompareNumbers {
    public static void main(String[] args) {
    //Declare number and call Static Method isEven
        int number;
        isEven(3);

        //Call Is Positive
        isPositive(-4);
    }

    // Static Method Is Even
    public static int isEven(int number){
        int chosenNumber = number;

        if ((chosenNumber % 2) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        return(chosenNumber);
    }

    // Static Method Is Positive
    public static int isPositive(int number){
        int chosenNumber = number;
        if (chosenNumber > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        return(chosenNumber);

    }
}
