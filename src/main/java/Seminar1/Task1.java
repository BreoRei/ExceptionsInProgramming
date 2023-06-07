package Seminar1;

import java.util.Scanner;

public class Task1 {
    //    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void arithmeticExc() {
        System.out.println(2 / 0);
    }

    public static void indexOutOfBoundsExc() {
        Integer[] arr = {2, 3, 5, 6, 8};
        int num = arr[6];
    }

    public static void nullPointerExc() {
        Integer[] arr = null;
        int num = arr[1];
    }

    //    Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    public static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Выход за пределы массива.\nИсключение: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Введено не корректное значение.\nИсключение: " + e);
        } catch (NullPointerException e) {
            System.err.println("Значение отсутствует.\nИсключение: " + e);
        }
        return sum;
    }
//    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
//    элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
//    необходимо как-то оповестить пользователя.
    public static int[] differenceTwoArrays() {
        int[] arrayNew = null;
        int [] args1 = createArrays("1");
        int [] args2 = createArrays("2");
        int lengthArgs1 = args1.length;
        int lengthArgs2 = args2.length;
        if (lengthArgs1 != lengthArgs2) {
            System.err.println("Длина массивов разная.");
        } else {
            arrayNew = new int[lengthArgs1];
            for (int i = 0; i < lengthArgs1; i++) {
                arrayNew[i] = args1[i] - args2[i];
            }
        }
        return arrayNew;
    }

    public static int[] createArrays(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер " + text + "-массива: ");
        int lengthArgs = scanner.nextInt();
        int[] array = new int[lengthArgs];
        for (int i = 0; i < lengthArgs; i++) {
            System.out.print("Введите " + (i + 1) + "-число: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
