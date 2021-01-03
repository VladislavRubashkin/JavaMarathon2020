package day4;

public class Task2 {
    /*
    Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
    Затем, используя циклы for each вывести в консоль:
    -наибольший элемент массива
    -наименьший элемент массива
    -количество элементов массива, оканчивающихся на 0
    -сумму элементов массива, оканчивающихся на 0

    Использовать сортировку запрещено.
     */
    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10000));
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int min = arr[0];
        System.out.println();
        for (int i : arr) {
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
            if (i % 10 == 0){
                count++;
            }
        }
        for (int i : arr) {
            if (i % 10 == 0){
                sum += i;
            }
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}
