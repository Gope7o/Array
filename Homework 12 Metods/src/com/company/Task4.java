package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter an Alphabet :");
        char ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.next().charAt(0);

        System.out.println(findIsVowelOrIsConstant(ch));
    }


    private static char findIsVowelOrIsConstant(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + ":Is vowel!");
                break;
            default:
                System.out.println(ch + ":Is constant!");
                return ch;
        }
        return ch;
    }
}

