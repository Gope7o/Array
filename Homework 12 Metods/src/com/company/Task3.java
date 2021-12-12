package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        boolean result = checkTheRemainderFromDividingOfFirstNumberAreSame(a, b, c);
        System.out.println(result);
    }

    public static boolean checkTheRemainderFromDividingOfFirstNumberAreSame(double a, double b, double c) {
        return a % b == a % c;
    }
}

