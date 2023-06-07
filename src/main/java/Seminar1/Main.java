package Seminar1;

import java.util.Arrays;

import static Seminar1.Task1.*;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };
//первое задание.
//        System.out.println("Первое задание");
//        arithmeticExc();
//        indexOutOfBoundsExc();
//        nullPointerExc();

//второе задание
        sum2d(array);
        System.out.println();

//третье задание.
        System.out.println(Arrays.toString(differenceTwoArrays()));
    }
}
