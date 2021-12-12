package com.company;

import java.util.Scanner;

public class numberx {

    public static <Srtring> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numText = sc.nextLine();

        int number = Integer.parseInt(numText);



        System.out.println( number > 0 ? number : number * -1);

    }
}
