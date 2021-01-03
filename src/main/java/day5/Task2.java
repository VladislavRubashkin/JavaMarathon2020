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

