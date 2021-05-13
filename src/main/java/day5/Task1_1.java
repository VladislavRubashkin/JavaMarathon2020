package day5;

public class Task1_1 {
    public static void main(String[] args) {
        Car1_1 car1_1 = new Car1_1();
        car1_1.setYear(1);
        car1_1.setColor("Black");
        car1_1.setModel("BMW");
        System.out.println("Марка автомобиля: " + car1_1.getModel() + " ,цвета: " + car1_1.getColor() + ", возраст: "
        + car1_1.getYear() + " год.");
    }
}
