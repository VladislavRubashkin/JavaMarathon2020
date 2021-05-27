package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randArr = new int[1000];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = random.nextInt(100);
        }

        File file1 = new File("file3.txt");
        File file2 = new File("file4.txt");

        try {
            PrintWriter printWriter1 = new PrintWriter(file1);
            for (int j : randArr) {
                printWriter1.println(j);
            }
            printWriter1.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter printWriter2 = new PrintWriter(file2);
            double sum = 0;
            int count = 0;

            while (scanner.hasNextLine()) {
                sum += Double.parseDouble(scanner.nextLine());
                count++;
                if (count == 20) {
                    printWriter2.println(sum / count);
                    count = 0;
                    sum = 0;
                }
            }
            scanner.close();
            printWriter2.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }

        printResult(file2);
    }

    public static void printResult(File file){
        int result = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                result += Double.parseDouble(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
