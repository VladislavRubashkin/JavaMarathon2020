package day12.task3_3;

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
        System.out.println();

        Collections.shuffle(musicBands);
        System.out.println();

        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musicBands = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                musicBands.add(band);
            }
        }
        return musicBands;
    }
}
