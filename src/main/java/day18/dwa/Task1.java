package day18.dwa;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int i = 0;

        System.out.println(recursionSum(numbers, i));
    }
    public static int recursionSum(int[] numbers, int i){
        if (i == numbers.length){
            return 0;
        }
        return numbers[i] + recursionSum(numbers, i + 1);
    }
}
