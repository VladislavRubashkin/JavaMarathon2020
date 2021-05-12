package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        int min = array[0];
        int max = array[0];
        int count = 0;
        int sum = 0;
        for (int i : array) {
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
            if (i % 10 == 0){
                count++;
                sum += i;
            }
        }
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Количество чисел,оканчивающихся на 0 равно: " + count);
        System.out.println("Сумма чисел,оканчивающихся на 0 равна: " + sum);

    }
}
