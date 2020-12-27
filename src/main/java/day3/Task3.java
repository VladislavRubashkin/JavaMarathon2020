package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1;
        double number2;
        for (int i = 0; i < 5; i++) {
            number1 = scanner.nextDouble();
            number2 = scanner.nextDouble();
            if(number2 == 0.0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(number1/number2);
        }
    }
}
