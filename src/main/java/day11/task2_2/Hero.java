package day11.task2_2;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    double magicDef;
    int physAtt;
    public final static int MAX_HEALTH = 100;
    public final static int MIN_HEALTH = 0;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAtt * (1 - hero.physDef);
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                '}';
    }
}
