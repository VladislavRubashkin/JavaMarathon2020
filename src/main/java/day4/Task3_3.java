package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[12][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        int maxSum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                count = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой: " + count);

    }
}
