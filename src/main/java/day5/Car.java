package day5;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year){
        if (year <= 0){
            System.out.println("Год выпуска не может быть меньше 0");
        }else{
            this.year = year;
        }
    }
    public void setColor(String color){
        if (color.isEmpty()){
            System.out.println("Цвет должен быть указан");
        }else{
            this.color = color;
        }
    }
    public void setModel(String model){
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
}
