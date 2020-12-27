package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1;
        double number2;
        while (true) {
             number1 = scanner.nextDouble();
             number2 = scanner.nextDouble();
            if (number2 == 0.0)
                break;
            System.out.println(number1/number2);
        }
    }
}
