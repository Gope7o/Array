package com.company;

import java.util.Scanner;

public class blackjack {

    public static <Srtring> void main(String[] args) {


        int a = 5;
        int b = 10;

        boolean isASmallerThan21 = a <= 21;
        boolean isASmallerThanB = a < b;
        boolean isAInRange = isASmallerThan21 || isASmallerThanB;

        boolean isBSmallerThan21 = b <= 21;
        boolean isBSmallerThanA = b < a;
        boolean isBInRange = isBSmallerThan21 || isBSmallerThanA;

        boolean isInputInRange = isAInRange || isBInRange;

        System.out.println();
        // До тук я докарах




    }
}
