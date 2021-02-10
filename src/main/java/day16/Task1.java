package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        printResult(file);

    }

    public static void printResult(File file){
        int sum = 0;
        double middle = 0.0;

        try {
            Scanner scanner = new Scanner(file);

            String[] number = scanner.nextLine().split(" ");
            double[] integer = new double[number.length];
            for (int i = 0; i < integer.length; i++) {
                    integer[i] = Double.parseDouble(number[i]);
            }
            for (double i : integer) {
                sum += i;
            }

            middle = (double) sum/integer.length;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf(middle + " --> %.3f" , middle);

    }
}

