package com.vso;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please insert number :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= (row + n) - 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}