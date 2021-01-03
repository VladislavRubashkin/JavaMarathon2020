package day6;

public class Teacher {
    private String name;
    private String lessons;

    public Teacher(String name, String lessons) {
        this.name = name;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    void  evaluate(Student student){
        int assessment = ((int)(Math.random() * 4 + 2));
        String mark = null;
        switch (assessment){
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил(а) студента с именем " + student.getName() +
                " по предмету " + lessons + " на оценку " + mark);
    }
}
