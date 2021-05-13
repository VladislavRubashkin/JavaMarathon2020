package day6;

import java.util.Random;

public class Teacher1_1 {
    private String name;
    private String lesson;

    public Teacher1_1(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    void evaluate(Student1_1 student1_1){
        Random random = new Random();
        int bal = random.nextInt(5) + 2;
        String mark = null;
        switch (bal){
            case 2:
                mark = "Плохо";
            case 3:
                mark ="Удовлетворительно";
                break;
            case 4:
                mark ="Хорошо";
                break;
            case 5:
                mark ="Отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил(а) студента с именем " + student1_1.getName() +
                " по предмету " + lesson + " на оценку " + mark);

    }

}
