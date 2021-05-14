package day7;

public class Task1_1 {
    public static void main(String[] args) {
        Airplane1_1 airplane1_1 = new Airplane1_1("Boing", 2015, 122, 200000);
        Airplane1_1 airplane1_2 = new Airplane1_1("Airbus", 2018, 155, 25000);
        Airplane1_1.compareAirplanes(airplane1_1,airplane1_2);
    }
}
