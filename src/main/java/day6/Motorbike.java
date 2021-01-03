package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        if (year <= 0){
            System.out.println("Год выпуска не может быть меньше 0");
        }else {
            this.year = year;
        }
        if (color.isEmpty()){
            System.out.println("Цвет должен быть указан");
        }else{
            this.color = color;
        }
        if (model.isEmpty()){
            System.out.println("Модель должна быть указана");
        }else{
            this.model = model;
        }
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }

    public void info(){
        System.out.println("Это мотоцикл");

    }
    public int yearDifference(int inputYear){
        if (inputYear < year){
            System.out.println("Текущая дата не может быть меньше года выпуска.");
        }
        return Math.abs(inputYear - year);
    }
}
