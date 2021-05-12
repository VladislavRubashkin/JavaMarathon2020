package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Длинна массива равна: " + n);
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int sum = 0;
        for (int i : array) {
            if (i > 8){
                count++;
            }
            if (i == 1){
                count1++;
            }
            if (i % 2 == 0){
                count2++;
            }
            if (i % 2 != 0){
                count3++;
            }
            sum += i;
        }
        System.out.println("Количество чисел больше 8 равно: " + count);
        System.out.println("Количество чисел равных 1 равно: " + count1);
        System.out.println("Количество четных чисел равно: " + count2);
        System.out.println("Количество нечетных чисел равно: " + count3);
        System.out.println("Сумма всех элементов массива равна: " + sum);

    }
}
