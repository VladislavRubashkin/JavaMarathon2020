package day11.task2_2;

public class Warrior extends Hero {

    private final static int MAX_HEALTH = 100;
    private final static int MIN_HEALTH = 0;

    public Warrior(){
        this.physAtt = 30;
        this.physDef = 0.8;
        this.magicDef = 0.0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                '}';
    }
}
