package day12.task4_4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Pol");
        members1.add("Jim");
        members1.add("Kyle");
        MusicBand musicBand1 = new MusicBand("Group1", 2000, members1);
        MusicBand.printMembers(musicBand1);

        System.out.println();

        List<String> members2 = new ArrayList<>();
        members2.add("Lyk");
        members2.add("Pit");
        members2.add("Alis");
        MusicBand musicBand2 = new MusicBand("Group2", 2015, members2);
        MusicBand.printMembers(musicBand2);

        System.out.println();

        MusicBand.transferMembers(musicBand1, musicBand2);
        System.out.println("---------------");
        MusicBand.printMembers(musicBand1);
        System.out.println("---------------");
        MusicBand.printMembers(musicBand2);
    }
}
