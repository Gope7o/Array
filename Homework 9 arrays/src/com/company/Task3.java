package com.company;

public class Task3 {
    public static void main(String[] args) {
        int[] arrayOne = {3, 5, 8, 9, 4, 5};
        int[] arrayTwo = {11, 22, 33, 44, 55, 66};
        int[] arrayResult = new int[6];
        arrayResult[0] = arrayOne[0];
        arrayResult[2] = arrayOne[2];
        arrayResult[4] = arrayOne[4];
        arrayResult[1] = arrayTwo[1];
        arrayResult[3] = arrayTwo[3];
        arrayResult[5] = arrayTwo[5];
        System.out.println();
        System.out.print(arrayResult[0] + ",");
        System.out.print(arrayResult[1] + ",");
        System.out.print(arrayResult[2] + ",");
        System.out.print(arrayResult[3] + ",");
        System.out.print(arrayResult[4] + ",");
        System.out.print(arrayResult[5]);

    }
}
