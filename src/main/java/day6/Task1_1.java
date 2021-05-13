package day6;

public class Task1_1 {
    public static void main(String[] args) {
        Car1_1 car1_1 = new Car1_1();
        car1_1.setYear(2019);
        car1_1.info();
        System.out.println(car1_1.yearDifference(2020));

        Motorbike1_1 motorbike1_1 = new Motorbike1_1(2019,"Black","Yamaha");
        motorbike1_1.info();
        System.out.println(motorbike1_1.yearDifference(2021));
    }
}
