package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        boolean result = checkTheRemainderFromDividingAreSame(a, b);

        System.out.println(result);
    }

    public static boolean checkTheRemainderFromDividingAreSame(double a, double b) {
        return a % 3 == b % 3;
    }
}
