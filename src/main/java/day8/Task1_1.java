package day8;

public class Task1_1 {
    public static void main(String[] args) {
        stringTime();
        stringBuilderTime();
        info();
    }

    public static long stringTime(){
        long start,end;
        String str = null;
        start = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            str += i + " ";
        }
        end = System.nanoTime();
        return end - start;
    }
    public static long stringBuilderTime(){
        long start,end;
        StringBuilder stringBuilder = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        end = System.nanoTime();
        return end - start;
    }

    public static void info(){
        System.out.println("---String--- cold start time " + String.format("%,12d",stringTime()) + " ns");
        System.out.println();
        System.out.println();
        System.out.println("---String--- warmed JRE time " + String.format("%,12d",stringTime()) + " ns");
        System.out.println();
        System.out.println();
        System.out.println("---StringBuilder--- cold start time " + String.format("%,12d",stringBuilderTime()) + " ns");
        System.out.println();
        System.out.println();
        System.out.println("---StringBuilder--- warmed JRE time " + String.format("%,12d",stringBuilderTime()) + " ns");
    }
}
