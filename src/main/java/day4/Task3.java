package day4;

import java.util.Random;

public class Task3 {
    /*
     Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
     (m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки,
     сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
     Пример сгенерированной матрицы (для простоты m=3, n=5):

     3 2 1 5 7     // сумма - 18
     1 2 5 6 2     // сумма - 16
     3 4 9 6 4    // сумма - 26

     Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
     */
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        Random random = new Random();

        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int maxSum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum >= maxSum){
                maxSum = sum;
                count = i;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + count);
    }
}
