package Seminar3;

import java.time.DateTimeException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataInput {
    static Scanner scanner = new Scanner(System.in);

    public static String[] UserData() {
        String[] data;
        String dataString;
        System.out.print("""
                Введите данные в произвольном порядке, разделенные пробелом:
                Фамилия Имя Отчество датарождения номертелефона пол.
                               
                Форматы данных:
                Фамилия, имя, отчество - строки.
                Дата_рождения - строка формата dd.mm.yyyy.
                Номер_телефона - целое беззнаковое число без форматирования.
                Пол - символ латиницей f или m.
                               
                Введите данные:
                >>>""");

        try {
            dataString = scanner.nextLine().toLowerCase();
            data = dataString.split(" ");
            // формат фамилии
            data[0] = data[0].toUpperCase().charAt(0) + data[0].substring(1);
            // формат Имя
            data[1] = data[1].toUpperCase().charAt(0) + data[1].substring(1);
            // формат Отчества
            data[2] = data[2].toUpperCase().charAt(0) + data[2].substring(1);
            if (data.length != 6) {
                throw new IndexOutOfBoundsException();
            }
            // Проверка даты рождения
            dateParser(data[3]);
            // Проверка телефона
            phoneNumberChecker(data[4]);
            // Проверка пола
            genderChecker(data[5]);
            System.out.println("Корректный ввод данных.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Не верное количество данных.");
            throw new RuntimeException();
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод телефона.");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Неверный ввод пола.");
            throw new RuntimeException();
        }
        return data;
    }

    static void dateParser(String dateOfBirth) throws DateTimeException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(dateOfBirth, formatter);
        } catch (DateTimeException e) {
            throw new DateTimeException("Error, time format.");
        }
    }

    static void phoneNumberChecker(String phoneNumber) throws NumberFormatException {
        try {
            String phoneNum = String.format("%s", phoneNumber.charAt(0));
            if (phoneNum.equals("8") && phoneNumber.length() == 11) {
                Double.parseDouble(phoneNumber);
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }

    static void genderChecker(String gender) throws RuntimeException {
        try {
            int genderLength = gender.length();
            if (genderLength > 1) {
                throw new RuntimeException();
            } else {
                if (!(gender.equals("m") || gender.equals("f"))) {
                    throw new RuntimeException();
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
    }

    public static String stringFormatForWriting(String[] data) {
        String result;
        result = String.format("<%s><%s><%s><%s><%s><%s>\n", data[0], data[1], data[2], data[3], data[4], data[5]);
        return result;
    }
}
