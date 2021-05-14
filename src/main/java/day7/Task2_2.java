package day7;

import java.util.Random;

public class Task2_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player1_1 player1 = new Player1_1(random.nextInt(11) + 90);
        Player1_1 player2 = new Player1_1(random.nextInt(11) + 90);
        Player1_1 player3 = new Player1_1(random.nextInt(11) + 90);
        Player1_1 player4 = new Player1_1(random.nextInt(11) + 90);
        Player1_1 player5 = new Player1_1(random.nextInt(11) + 90);
        Player1_1 player6 = new Player1_1(random.nextInt(11) + 90);
        Player1_1.info();
        Player1_1 player7 = new Player1_1(random.nextInt(11) + 90);
        Player1_1 player8 = new Player1_1(random.nextInt(11) + 90);
        Player1_1.info();

        for (int i = 0; i < 100; i++) {
            player1.run();
        }
        Player1_1.info();
    }
}
