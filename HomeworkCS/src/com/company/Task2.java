package com.company;

import java.util.Scanner;

public class Task2 {

    public static <Srtring> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int bonus = Integer.parseInt(number);


        switch (bonus) {
            case 1:
            case 2:
            case 3:
                System.out.println(bonus * 10);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(bonus * 100);
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(bonus * 1000);
                break;
            default:
                System.out.println("Error");


        }
    }
}
