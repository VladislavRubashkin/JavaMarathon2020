package day7;

public class Player1_1 {
    private int stamina;
    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player1_1(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0){
            return;
        }
        stamina--;
        if (stamina == 0){
            countPlayers--;
        }
    }

    public static void info() {
        String s = "свободных";
        String s1 = "мест";
        switch (countPlayers){
            case 5:
                s = "свободное";
                s1 = "место";
                break;
            case 4:
            case 3:
            case 2:
                s = "свободных";
                s1 = "места";
                break;
            case 1:
                s = "свободных";
                s1 = "мест";
                break;
        }
        if (countPlayers < 6){
            System.out.println("Команды не полные, на поле ещё есть " + (6 - countPlayers) + " " + s + " " + s1 + "." );
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }
}
