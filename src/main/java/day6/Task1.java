package day6;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2015, 130, 35000);
        airplane.setYear(2014);
        airplane.setLength(145);
        airplane.fillUp(1500);
        airplane.fillUp(2500);
        airplane.info();
    }
}
