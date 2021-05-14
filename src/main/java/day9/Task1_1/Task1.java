package day9.Task1_1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Vladislav", "Programming");
        Teacher teacher = new Teacher("Life", "Mathematics");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        System.out.println();
        student.printInfo();

        System.out.println();
        teacher.printInfo();
    }
}
