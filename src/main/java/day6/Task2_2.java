package day6;

public class Task2_2 {
    public static void main(String[] args) {
        Airplane1_1 airplane1_1 = new Airplane1_1("Suhoy", 2018, 125,20000);
        airplane1_1.setYear(2012);
        airplane1_1.setLength(90);
        airplane1_1.fillUp(300);
        airplane1_1.fillUp(250);
        airplane1_1.info();
    }
}
