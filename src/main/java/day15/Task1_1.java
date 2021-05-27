package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        File file = new File("src\\main\\resources\\shoes.csv");
        File file1 = new File("missing1_shoes.csv");

        writeToFile(file,file1);
    }

    public static void writeToFile(File file, File file1){

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(file1);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] strings = line.split(";");
                int res = Integer.parseInt(strings[2]);
                if (res == 0){
                    pw.println(strings[0] + " " + strings[1] + " " + strings[2]);
                }
            }
            scanner.close();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
