package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter Year :");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(findYearIsLeap(year));
    }

    public static boolean findYearIsLeap(int year) {
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        return leap;
    }
}

