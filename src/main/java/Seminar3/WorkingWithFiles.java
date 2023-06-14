package Seminar3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class WorkingWithFiles {
    public static void writeToFile(String nameFile, String data) throws IOException {
        String file = String.format("src/main/java/Seminar3/data/%s.txt", nameFile);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(data);
            System.out.println("Данные записаны в файл.");
        }
    }

    public static String ReadFileLines(String nameFile) throws FileNotFoundException {
        String file = String.format("src/main/java/Seminar3/data/%s.txt", nameFile);
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine()+"\n";
            while (line != null) {
                data.append(line).append("\n");
                line = reader.readLine();
            }
        } catch (IOException e) {

            throw new FileNotFoundException();
        }
        return data.toString();
    }
}
