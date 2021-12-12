package com.company;

public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };
        int sum1 = 0;
        for (int i = 0; i < 6; i++) {
            sum1 = sum1 + numbers[i][0];
            System.out.print(numbers[i][0] + " ");
        }
        System.out.println("The sum of elements is :" + sum1);

        int sum2 = 0;
        for (int i = 0; i < 6; i++) {
            sum2 = sum2 + numbers[i][2];
            System.out.print(numbers[i][2] + " ");
        }
        System.out.println("The sum of elements is :" + sum1);
        int sum3 = 0;
        for (int i = 0; i < 6; i++) {
            sum3 = sum3 + numbers[i][4];
            System.out.print(numbers[i][4] + " ");
        }
        System.out.println("The sum of elements is :" + sum3);
    }
}
