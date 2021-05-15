package day11.task2_2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private int magicAtt;
    public final static int HEAL_HIMSELF = 50;
    public final static int HEAL_TEAMMATE = 30;

    public Shaman() {
        this.physAtt = 10;
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.magicAtt = 15;
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
    public void magicalAttack(Hero hero) {
        double attack = magicAtt * (1 - hero.magicDef);
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
