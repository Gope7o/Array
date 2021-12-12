package com.company;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {12, 31, 4, 21, 6, 9};
        int max = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (secondMax < array[i] && max != secondMax) {
                secondMax = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(secondMax);
    }
}
