package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        File file = new File("people2");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file){
        ArrayList<String> peoples = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                int res = Integer.parseInt(person[1]);
                if (res <= 0){
                    throw new IllegalArgumentException();
                }
                peoples.add(line);
            }
            return peoples;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Не корректный входной файл");
        }

        return null;
    }
}
