package day12.task5_5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("1", 1));
        members1.add(new MusicArtist("2", 2));
        members1.add(new MusicArtist("3", 3));
        day12.task5_5.MusicBand musicBand = new day12.task5_5.MusicBand("Group1", 2020, members1);
        day12.task5_5.MusicBand.printMembers(musicBand);

        System.out.println();

        List<MusicArtist> members2 = new ArrayList<>();
        members1.add(new MusicArtist("4", 4));
        members1.add(new MusicArtist("5", 5));
        members1.add(new MusicArtist("6", 6));
        day12.task5_5.MusicBand musicBand1 = new day12.task5_5.MusicBand("Group2", 2021, members2);
        day12.task5_5.MusicBand.printMembers(musicBand1);


        System.out.println();

        MusicBand.transferMembers(musicBand, musicBand1);
        day12.task5_5.MusicBand.printMembers(musicBand);
        System.out.println("----------");
        day12.task5_5.MusicBand.printMembers(musicBand1);
    }
}
