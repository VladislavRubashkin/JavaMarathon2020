package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int  MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6)
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if (stamina == 0){
            return;
        }
         stamina--;
        if (stamina == 0){
            countPlayers--;
        }
    }

    public static void info(){
        String s1 = null;
        String s2 = null;
        switch (countPlayers){
            case 5:
                s1 = "свободное";
                s2 = "место";
                break;
            case 4:
            case 3:
            case 2:
                s1 = "свободных";
                s2 = "места";
                break;
            case 1:
                s1 = "свободных";
                s2 = "мест";
                break;
        }
        if (countPlayers < 6){
            System.out.println( "Команды неполные. На поле еще есть "+ (6 - countPlayers) + " " +  s1 + " " + s2);
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
