package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Курт Кобейн", 23));
        members1.add(new MusicArtist("Крист Новоселич", 33));
        members1.add(new MusicArtist("Дэйв Грол", 25));

        MusicBand musicBand1 = new MusicBand("Nirvana", 1987, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Пол Маккартни", 40));
        members2.add(new MusicArtist("Джон Леннон", 35));
        members2.add(new MusicArtist("Джордж Харрисон", 34));
        members2.add(new MusicArtist("Ринго Старр", 37));

        MusicBand musicBand2 = new MusicBand("Beatles", 1960, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
