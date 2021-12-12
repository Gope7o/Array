package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nМоля въведете число от 0 до 1000: ");
        short numbers;
        numbers = input.nextShort();
        int hundreds = (byte) (numbers / 100 | 0);
        int tensAndOnes;
        if (numbers > 99) tensAndOnes = (byte) (numbers % 100);
        else tensAndOnes = (byte) (numbers * 1);

        if (numbers == 0) {
            System.out.print("Нула");
        }
        if (numbers == 1000) {
            System.out.print("Хиляда");
        }

        byte ones = (byte) (numbers % 10);
        switch (hundreds) {
            case 1:
                System.out.print("\nСто ");
                break;
            case 2:
                System.out.print("Двеста ");
                break;
            case 3:
                System.out.print("Триста ");
                break;
            case 4:
                System.out.print("Четиристотин ");
                break;
            case 5:
                System.out.print("Петстотин ");
                break;
            case 6:
                System.out.print("Шестотин ");
                break;
            case 7:
                System.out.print("Седемстотин ");
                break;
            case 8:
                System.out.print("Осемстотин ");
                break;
            case 9:
                System.out.print("Деветстотин ");
                break;
        }

        if (tensAndOnes >= 20 && tensAndOnes < 30) System.out.print("Двадесет");
        else if (tensAndOnes >= 30 && tensAndOnes < 40) System.out.print("Тридесет");
        else if (tensAndOnes >= 40 && tensAndOnes < 50) System.out.print("Четиредесет");
        else if (tensAndOnes >= 50 && tensAndOnes < 60) System.out.print("Петдесет");
        else if (tensAndOnes >= 60 && tensAndOnes < 70) System.out.print("Шесдесет");
        else if (tensAndOnes >= 70 && tensAndOnes < 80) System.out.print("Седемдесет");
        else if (tensAndOnes >= 80 && tensAndOnes < 90) System.out.print("Осемдесет");
        else if (tensAndOnes >= 90 && tensAndOnes < 100) System.out.print("Деведесет");
        if (hundreds >= 1 ? tensAndOnes >= 1 : tensAndOnes > 20) System.out.print(" и ");

        switch (tensAndOnes) {
            case 1:
                System.out.print("Едно");
                break;
            case 2:
                System.out.print("Две");
                break;
            case 3:
                System.out.print("Три");
                break;
            case 4:
                System.out.print("Четири");
                break;
            case 5:
                System.out.print("Пет");
                break;
            case 6:
                System.out.print("Шест");
                break;
            case 7:
                System.out.print("Седем");
                break;
            case 8:
                System.out.print("Осем");
                break;
            case 9:
                System.out.print("Девет");
                break;
            case 10:
                System.out.print("Десет");
                break;
            case 11:
                System.out.print("Единадесет");
                break;
            case 12:
                System.out.print("Дванадесет");
                break;
            case 13:
                System.out.print("Тринадесет");
                break;
            case 14:
                System.out.print("Четиринадесет");
                break;
            case 15:
                System.out.print("Петнадесет");
                break;
            case 16:
                System.out.print("Шеснадасет");
                break;
            case 17:
                System.out.print("Седемнадасет");
                break;
            case 18:
                System.out.print("Осемнадасете");
                break;
            case 19:
                System.out.print("Деветнадесет");
                break;
        }
        if (tensAndOnes > 20) {
            switch (ones) {
                case 1:
                    System.out.print(" Едно");
                    break;
                case 2:
                    System.out.println(" Две");
                    break;
                case 3:
                    System.out.print(" Три");
                    break;
                case 4:
                    System.out.print(" Четири");
                    break;
                case 5:
                    System.out.print(" Пет");
                    break;
                case 6:
                    System.out.print(" Шест");
                    break;
                case 7:
                    System.out.print(" Седем");
                    break;
                case 8:
                    System.out.print(" Осем");
                    break;
                case 9:
                    System.out.print(" Девет");
                    break;
            }


        }

    }

}


