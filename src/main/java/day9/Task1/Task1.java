package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Math");
        Teacher teacher = new Teacher("Sergey Aleksandrovich", "Biologi");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        System.out.println();
        student.printInfo();
        teacher.printInfo();

    }
}
