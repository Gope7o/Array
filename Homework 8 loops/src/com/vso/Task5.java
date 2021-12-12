package com.vso;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

            switch (number) {
                case 0 :
                    System.out.println("");
                    break;
                case 1 :
                    System.out.println("1*");
                    break;
                case 2 :
                    System.out.println("2**");
                    break;
                case 3 :
                    System.out.println("3***");
                    break;
                case 4:
                    System.out.println("4****");
                    break;
                case 5:
                    System.out.println("5*****");
                    break;
                case 6:
                    System.out.println("6******");
                    break;
                case 7:
                    System.out.println("7*******");
                    break;
                case 8:
                    System.out.println("8********");
                case 9:
                    System.out.println("9*********");
                    break;
                default:
                    System.out.println("Програмата работи само с една въведена цифра!");
            }

        }
    }



