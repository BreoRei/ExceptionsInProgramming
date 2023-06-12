package Seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static float getFloatNumber(boolean flag) {
        Scanner scanner = new Scanner(System.in);
        float floatNumber;
        System.out.print("Введите дробное число --> ");
        try {
            floatNumber = scanner.nextFloat();
        } catch (InputMismatchException e) {
            if(flag) {
                System.err.println("Вы ввели не число!");
                System.out.println();
                floatNumber = getFloatNumber(false);
            } else {
                floatNumber = 0;
            }
        }
        return floatNumber;
    }

    public static float getFloatNumber2() {
        Scanner scanner = new Scanner(System.in);
        float floatNumber;
        System.out.print("Введите дробное число --> ");
        try {
            floatNumber = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("Вы ввели не число!");
            System.out.println();
            floatNumber = getFloatNumber2();
            }
        return floatNumber;
    }
}
