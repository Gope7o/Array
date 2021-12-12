package com.company;

public class Task1 {

    public static void main(String[] args) {
        for (int firstNumber = 1; firstNumber <= 9; firstNumber++) {
            for (int secondNumber = 0; secondNumber <= 9; secondNumber++) {
                for (int thirdNumber = 0; thirdNumber <= 9; thirdNumber++) {
                    for (int fourthNumber = 0; fourthNumber <= 9; fourthNumber++) {
                        if ((firstNumber + secondNumber) == (thirdNumber + fourthNumber)) {
                            System.out.println();
                            System.out.print(firstNumber);
                            System.out.print(secondNumber);
                            System.out.print(thirdNumber);
                            System.out.print(fourthNumber);
                        }
                    }
                }
            }
        }
    }
}