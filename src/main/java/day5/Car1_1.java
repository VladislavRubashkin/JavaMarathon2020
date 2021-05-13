package day5;

public class Car1_1 {
    private int year;
    private String color;
    private String model;

    public void setYear(int year){
        if (year <= 0){
            System.out.println("Возраст не может быть отрицательным");
        } else {
            this.year = year;
        }
    }
    public int getYear(){
        return year;
    }
    public void setColor(String color){
        if (color.isEmpty()){
            System.out.println("Цвет должен быть задан");
        } else {
            this.color = color;
        }
    }
    public String getColor(){
        return color;
    }
    public void setModel(String model){
        if (model.isEmpty()){
            System.out.println("Модель должна быть задана");
        } else {
            this.model = model;
        }
    }
    public String getModel(){
        return model;
    }
}
