package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Ленингра́д", 1996));
        musicBands.add(new MusicBand("NeuroDubel",2000));
        musicBands.add(new MusicBand("Adelitas Way",2009));
        musicBands.add(new MusicBand("Aerosmith",1964));
        musicBands.add(new MusicBand("Bon Jovi",1983));
        musicBands.add(new MusicBand("Baroness",2003));
        musicBands.add(new MusicBand("ÁtomicKítten",1998));
        musicBands.add(new MusicBand("ANGERME", 2009));
        musicBands.add(new MusicBand("Animal ДжаZ", 2000));
        musicBands.add(new MusicBand("AfterForever",1995));
        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands){
        List<MusicBand> musicBands2 = new ArrayList<>();
        for (int i = 0; i < musicBands.size(); i++) {
            if (musicBands.get(i).getYear() > 2000){
                musicBands2.add(musicBands.get(i));
            }
        }
        return musicBands2;
    }
}
