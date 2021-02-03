package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Курт Кобейн");
        members1.add("Крист Новоселич");
        members1.add("Дэйв Грол");

        MusicBand musicBand1 = new MusicBand("Nirvana", 1987, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Пол Маккартни");
        members2.add("Джон Леннон");
        members2.add("Джордж Харрисон");
        members2.add("Ринго Старр");

        MusicBand musicBand2 = new MusicBand("Beatles", 1960, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
