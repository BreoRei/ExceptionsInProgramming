package Seminar2;

import java.util.Scanner;

public class Task4 {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void enterData() {
        Scanner scanner = new Scanner(System.in);
        String value;
        try {
            System.out.print("Введите значение --> ");
            value = scanner.nextLine();
            if(value.isEmpty()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("Вводить пустую строку нельзя!");
        }
    }
}
