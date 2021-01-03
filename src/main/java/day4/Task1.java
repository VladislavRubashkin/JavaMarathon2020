package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        int wan = 0;
        int chet = 0;
        int neChet = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() + 10) * 10;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        for (int j : array) {
            if (j > 8) {
                count++;
            }
        }
        for (int i : array) {
            if (array[i] == 1){
                wan++;
            }
        }
        for (int i : array) {
            if (array[i] % 2 == 0){
                chet++;
            }
        }
        for (int i : array) {
            if (array[i] % 2 != 0){
                neChet++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        System.out.println();
        System.out.println("Длинна массива: " + size);
        System.out.println("Количество чисел больше 8: " + count);
        System.out.println("Количество чисел, равных 1: " + wan);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество не четных чисел: " + neChet);
        System.out.println("Сумма массива равна: " + sum);
    }
}
