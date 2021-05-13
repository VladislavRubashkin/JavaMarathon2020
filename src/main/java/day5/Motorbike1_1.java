package day5;

public class Motorbike1_1 {
    private int age;
    private String color;
    private String model;

    public Motorbike1_1(int age, String color, String model){
        if (age < 0){
            System.out.println("Возраст должен быть положительным");
        } else {
            this.age = age;
        }
        if (color.isEmpty()){
            System.out.println("Цвет должен быть указан");
        } else {
            this.color = color;
        }
        if (model.isEmpty()){
            System.out.println("Модель должна быть указана");
        } else {
            this.model = model;
        }
    }

    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}
