package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please insert number to check it is perfect or not : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= 0; i++) {
            if (n % 2 != 0) {
                System.out.println("Is not perfect");
            }else{
                System.out.println("It is perfect!");
            }
        }
    }
}