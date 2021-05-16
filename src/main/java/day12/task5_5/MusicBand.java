package day12.task5_5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtist;

    public MusicBand(String name, int year, List<MusicArtist> musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtist = musicArtist;
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

    public List<MusicArtist> getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(List<MusicArtist> musicArtist) {
        this.musicArtist = musicArtist;
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for (MusicArtist musicArtist: a.getMusicArtist()) {
            b.getMusicArtist().add(musicArtist);
        }
        a.getMusicArtist().clear();
    }

    public static void printMembers(MusicBand musicBands){
        for (MusicArtist musicArtist : musicBands.getMusicArtist()) {
            System.out.println(musicArtist);
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
