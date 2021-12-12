package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please insert number :");

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int row = 1; row <= n; row++) {
            System.out.print("*");
            for (int col = 1; col < row; col++) {
                System.out.print("**");

            }
            System.out.println();
        }
    }
}



