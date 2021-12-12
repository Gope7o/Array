package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int secretNumber = rand.nextInt(20) + 1;
        int guess;
        do {

            System.out.println("Please, enter a guess between 1 - 20: ");
            guess = scanner.nextInt();

            if(guess == secretNumber) {
                System.out.println("Your guess is correct. Congratulations!");


            }else if (guess < secretNumber) {
                System.out.println("Your guess is smaller than the secret number");
            }
                else if (guess > secretNumber) {
                    System.out.println("Your guess is greater than the secret number");
            }

            }while (guess != secretNumber); {

        }
    }
}
