package day5;


public class Task2 {
    /*
    Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
    Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
    Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
    Вывести в консоль значение каждого из полей, используя get методы.
     */
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1998, "Red", "Honda");
        System.out.println(motorbike.getYear() + " " + motorbike.getColor() + " " + motorbike.getModel());

    }
}
    class Motorbike{
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

}
