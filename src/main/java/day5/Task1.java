package day5;

public class Task1 {
    /*
    Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”. Создать get и set методы
    для каждого поля. Создать экземпляр класса Автомобиль. Задать значение для каждого поля, используя set методы.
    Вывести в консоль значение каждого из полей, используя get методы.
    Созданный вами класс должен отвечать принципам инкапсуляции.
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1980);
        car.setColor("Black");
        car.setModel("BMW");
        System.out.println("Год выпуска: " + car.getYear() + " Цвет: " + car.getColor() + " Модель: " + car.getModel());
    }
}
class Car{
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
