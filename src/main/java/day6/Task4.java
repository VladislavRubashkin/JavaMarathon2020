package day6;

public class Task4 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ольга", "Математика");
        Student student = new Student("Александр");
        teacher.evaluate(student);
    }
}
