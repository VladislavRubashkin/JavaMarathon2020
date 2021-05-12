package day2;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b){
            while (a <= b){
                if (a % 5 == 0 && a % 10 != 0){
                    System.out.println(a);
                }
                a++;
            }
        } else if (a > b){
            while (a >= b){
                if (b % 5 == 0 && b % 10 != 0){
                    System.out.println(b);
                }
                b++;
            }
        }

    }
}
