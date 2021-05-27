package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        File file = new File("numbers");

        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        int sum = 0;
        int counter = 0;
        for (String s : numbersString) {
            sum += Integer.parseInt(s);
            counter++;
        }
        if (counter != 10){
            throw new IllegalAccessError("Некорректный входной файл");
        }
        System.out.println(sum);
    }
}
