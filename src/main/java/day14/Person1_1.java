package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class Person1_1 {
//    private String name;
//    private int age;
//
//    public Person1_1(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//
//    public static List<Person1_1> parseFileToObjList(File file){
//        ArrayList<Person1_1> person1_1s = new ArrayList<>();
//
//        try {
//            Scanner scanner = new Scanner(file);
//
//            while (scanner.hasNextLine()){
//                String line = scanner.nextLine();
//
//                String[] person1_1s1 = line.split(" ");
//                int res = Integer.parseInt(person1_1s1[1]);
//                if (res <= 0){
//                    throw new IllegalArgumentException();
//                }
//
////                Person1_1 currentPerson = new Person(person1_1s1[0], Integer.parseInt(person1_1s1[1]));
//
////                person1_1s.add(currentPerson);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        }
//
//
//    }
//
//    public String toString(){
//        return name + " " + age;
//    }
//
//}
