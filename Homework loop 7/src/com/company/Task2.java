package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please insert number : ");
        System.out.println("Please insert number gradation : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberGradation = scanner.nextInt();

        double result = Math.pow(number,numberGradation);
        System.out.println(result);
    }

}
