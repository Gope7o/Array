package com.company;

import java.util.Scanner;

public class triangle {
        public static <Srtring, String> void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String numA = sc.nextLine();
            String numB = sc.nextLine();
            String numC = sc.nextLine();

            int numberA = Integer.parseInt(numA);
            int numberB = Integer.parseInt(numB);
            int numberC = Integer.parseInt(numC);

            boolean aisPositive = numberA > 0;
            boolean bisPositive = numberB > 0;
            boolean cisPositive = numberC > 0;

            boolean sideA = numberA < numberB + numberC;
            boolean sideB = numberB < numberA + numberC;
            boolean sideC = numberC < numberA + numberB;

            boolean result = sideA && sideB && sideC && aisPositive && bisPositive && cisPositive;

            System.out.println(result);


        }
}
