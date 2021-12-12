package com.company;

import java.util.Scanner;

public class automobile {

    public static <Srtring> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numText = sc.nextLine();
        String numTexts = sc.nextLine();
        int numberAge = Integer.parseInt(numText);
        int numberPrice = Integer.parseInt(numTexts);

        boolean age = numberAge > 5 || numberAge <= 5;
        boolean price = numberPrice > 20000;

        boolean license = age && price;
        System.out.println(license);

    }
}
