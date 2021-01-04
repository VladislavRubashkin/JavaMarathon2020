package day8;

public class Task1 {
    public static void main(String[] args) {
        info();
    }
    public static long measure() {
        String s1 = " ";
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            s1 += i + " ";
        }
        System.out.print(s1 + "\n");
        en = System.nanoTime();
        return en - st;
    }
    public static long measure2() {
        StringBuilder sb = new StringBuilder();
        long st, en;
        st = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.print(sb.toString() + "\n");
        en = System.nanoTime();
        return en - st;
    }

    public static void info(){
        System.out.println("---String--- cold start time " + String.format("%,12d",measure()) + " ns");
        System.out.println();
        System.out.println();
        System.out.println("---String--- warmed JRE time " + String.format("%,12d",measure()) + " ns");
        System.out.println();
        System.out.println();
        System.out.println("---StringBuilder--- cold start time " + String.format("%,12d",measure2()) + " ns");
        System.out.println();
        System.out.println();
        System.out.println("---StringBuilder--- warmed JRE time " + String.format("%,12d",measure2()) + " ns");
    }

}
