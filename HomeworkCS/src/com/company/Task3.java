package com.company;

import java.util.Scanner;

public class Task3 {
    public static <Srtring> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        double a = 4;
        double b = 5;

        switch ((int) number) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(b - 1);
                break;
            case 4:
                System.out.println(a * b);
                break;
            case 5:
                System.out.println(a / b);
                break;
            case 6:
                System.out.println(b / a);
                break;
            default:
                System.out.println("Option does not exist");
        }
    }
}
