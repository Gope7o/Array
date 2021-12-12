package com.vso;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please insert number :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
