package com.company;

public class Task1 {

    public static void main(String[] args) {

        int[] numbersBefore = {1, 2, 3, 4, 5};
        int[] numbersAfter = new int[5];

        numbersAfter[0] = 0;
        numbersAfter[1] = numbersBefore[1] * 1;
        numbersAfter[2] = numbersBefore[2] * 2;
        numbersAfter[3] = numbersBefore[3] * 3;
        numbersAfter[4] = numbersBefore[4] * 4;

            System.out.println(numbersAfter[0]);
            System.out.println(numbersAfter[1]);
            System.out.println(numbersAfter[2]);
            System.out.println(numbersAfter[3]);
            System.out.println(numbersAfter[4]);
        }

    }



