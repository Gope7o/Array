package com.vso;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please insert number :");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            System.out.print("0");
            for (int col = 1; col <= (row - 1) * 2; col++) {
                System.out.print(" ");
            }


            System.out.print("0");


            System.out.println();
        }
    }
}
