package day12.task4_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for (String member: a.getMembers()) {
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    public static void printMembers(MusicBand musicBands){
        for (String member : musicBands.getMembers()) {
            System.out.println(member);
        }
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
