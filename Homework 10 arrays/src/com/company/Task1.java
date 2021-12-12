package com.company;

public class Task1 {
    public static void main(String[] args) {
        int[] evaluations = {4, 6, 2, 5, 7, 9, 4, 8, 6, 9, 3, 7};
        for (int i = 0; i < evaluations.length; i++) {
            for (int j = evaluations.length - 1; j > 0; j--) {
                if (evaluations[j] > evaluations[j - 1]) {
                    int swap = evaluations[j];
                    evaluations[j] = evaluations[j - 1];
                    evaluations[j - 1] = swap;
                }
            }
        }
        for (int i = 0; i < evaluations.length; i++) {
            System.out.print(evaluations[i] + " ");
        }
    }
}