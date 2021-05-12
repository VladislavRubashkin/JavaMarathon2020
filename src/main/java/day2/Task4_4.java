package day2;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;
        if (x >= 5){
            System.out.println(y = (x * x - 10) / (x + 7));
        } else if (x > -3 && x < 5){
            System.out.println(y = (x + 3) * (x * x - 2));
        } else {
            System.out.println(y = 420.0);
        }
//        int i = 1;
//        i = i++ + (( i > 2 )? i++: (i++ * i++)) + i++ ;
//        System.out.println(i);// 11
//
//        i = 2;
//        i = i++ + (( i > 2 )? i++: (i++ * i++)) + i++ ;
//        System.out.println(i); // 9
    }

}
