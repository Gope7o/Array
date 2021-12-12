package com.company;

import java.util.Scanner;

public class Main {

    public static <Srtring> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String numText = sc.nextLine();
       int number = Integer.parseInt(numText);

        boolean capacity = number > 35000;
        boolean haslight = true;

       boolean license = capacity && haslight;
       System.out.println(license);

    }
}
