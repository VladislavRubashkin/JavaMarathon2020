package day4;

import java.util.Scanner;

public class Task1 {
    /*
    1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
    его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в консоль
    информацию о:
    а) Длине массива
    б) Количестве чисел больше 8
    в) Количестве чисел равных 1
    г) Количестве четных чисел
    д) Количестве нечетных чисел
    е) Сумме всех элементов массива

    Пример:
    Введено число 10. Сгенерирован следующий массив:
    [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
    Информация о массиве:
    Длина массива: 10
    Количество чисел больше 8: 1
    Количество чисел равных 1: 0
    Количество четных чисел: 6
    Количество нечетных чисел: 4
    Сумма всех элементов массива: 46
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count8 = 0;
        int count1 = 0;
        int chet = 0;
        int neChet = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random()*10));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j : arr) {
            if (j > 8) {
                count8++;
            }
            if (j == 1) {
                count1++;
            }
            if (j % 2 == 0) {
                chet++;
            }
            if (j % 2 != 0) {
                neChet++;
            }
        }
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: " + neChet);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
