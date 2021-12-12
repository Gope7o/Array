package com.vso;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNumber = 0;
        int maxNumber = 0;
        System.out.println("Въведете броя на числата:");
        int number = input.nextInt();

        System.out.println("Въведете числата:");
        for (int i = 0; i < number; i++) {
            int n = input.nextInt();
            if (i == 0) {
                minNumber = n;
                maxNumber = n;
            }
            if (n < minNumber) minNumber = n;
            if (n > maxNumber) maxNumber = n;
        }

        System.out.println("\n" + "Най - малкото число е: " + minNumber);
        System.out.println("Най - голямото число е: " + maxNumber);

    }
}