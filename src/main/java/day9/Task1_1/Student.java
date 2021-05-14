package day9.Task1_1;

public class Student extends Human{
    private String groupName;

    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }
     public String getGroupName(){
        return groupName;
     }
     @Override
     public void  printInfo(){
        super.printInfo();
         System.out.println("Это студент с именем " + getName());
     }
}
