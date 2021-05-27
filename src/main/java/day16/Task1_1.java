package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        File file = new File("file3");
        printResult(file);
    }

    public static void printResult(File file){
        double x = 0.0;
        int count = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                x += scanner.nextDouble();
                count++;
            }

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        double value = x/count;
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        String result = decimalFormat.format(value);
//        double value2 = Double.parseDouble(result);
//        System.out.print(result);//34,767
        System.out.println(x/count + " --> " + result);
        System.out.println();
        System.out.printf(x/count + " --> %.3f ", x/count);
    }
}
