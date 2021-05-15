package day11.task2_2;

public class Paladin extends Hero implements  Healer {
    public final static int HEAL_HIMSELF = 25;
    public final static int HEAL_TEAMMATE = 10;
    public Paladin() {
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (this.health + HEAL_HIMSELF > MAX_HEALTH) {
            this.health = MAX_HEALTH;
        } else {
            this.health += HEAL_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                '}';
    }
}
