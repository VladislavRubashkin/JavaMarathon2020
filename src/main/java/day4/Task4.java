package day4;

import java.util.Random;

public class Task4 {
    /*
    Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
    Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой
    выведите значение суммы и индекс первого элемента тройки.
    Пример:
    *Для простоты пример показан на массиве размера 10

    [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

    Тройка с максимальной суммой: [8742, 1040, 3254]

    Вывод в консоль:
    13036
    7

    *Пояснение. Первое число - сумма тройки [8742, 1040, 3254]. Второе число - индекс первого элемента тройки,
    то есть индекс числа 8742.
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int maxSum = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arr[j];
            }
            if (sum > maxSum){
                maxSum = sum;
                count = i;
            }
        }
        System.out.println( "максимум среди сумм трех соседних элементов: " + maxSum + "\n" + count);
    }
}
