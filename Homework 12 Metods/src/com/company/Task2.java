package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Insert number between 1 - 7, to find who is that day of the week :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(getDayOfTheWeek(number));
    }

    private static int getDayOfTheWeek(int n) {
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Maybe in another universe");
        }
        return n;
    }
}
