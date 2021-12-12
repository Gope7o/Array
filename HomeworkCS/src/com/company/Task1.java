package com.company;

import java.util.Scanner;

public class Task1 {
    public static <Srtring> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 21 ) {
            System.out.println((n - 21) * -1);
       }
        else if (n - 21 > 21) {
           System.out.println((n - 21)  * 2);

        }
    }
}
