package com.plurasight;

public class CompareNumbers {
    public static void main(String[] args) {
        int number;
        isEven(3);
    }


    public static int isEven(int number){
        int chosenNumber = number;

        if ((chosenNumber % 2) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        return(chosenNumber);
    }
}
