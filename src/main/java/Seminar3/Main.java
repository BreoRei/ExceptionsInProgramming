package Seminar3;

import java.io.FileNotFoundException;
import java.io.IOException;

import static Seminar3.DataInput.UserData;
import static Seminar3.DataInput.stringFormatForWriting;
import static Seminar3.WorkingWithFiles.*;

public class Main {
    public static void main(String[] args) {
        String[] data;
        try {
            data = UserData();
            String result = stringFormatForWriting(data);
            writeToFile(data[0], result);
//            System.out.println("Фаил сущетвует");
//            String file1 = (ReadFileLines("Popov"));
//            System.out.println("Фаил отсутствует");
//            String file2 = (ReadFileLines("Ivanov"));
        } catch (RuntimeException e) {
            System.err.println("Ошибка c данными");
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка чтения фаила.");
        } catch (IOException e) {
            System.err.println("Ошибка записи");
        }
    }
}
