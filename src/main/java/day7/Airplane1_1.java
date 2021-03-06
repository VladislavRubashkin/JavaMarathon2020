package day7;

public class Airplane1_1 {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane1_1(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке:" + fuel);
    }

    int fillUp(int n) {
        return fuel += n;
    }

    public static void compareAirplanes(Airplane1_1 airplane1_1, Airplane1_1 airplane1_2){
        if (airplane1_1.length > airplane1_2.length){
            System.out.println("Самолет " + airplane1_1 + ", длинной " + airplane1_1.length + ", длинее " +
                    "самолета " + airplane1_2);
        } else {
            System.out.println("Самолет " + airplane1_2 + ", длинной " + airplane1_2.length + ", длинее " +
                    "самолета " + airplane1_1);
        }
    }
}
