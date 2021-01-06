package day11.task2;

public abstract class Hero implements PhysAttack {

    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    int health;
    double physDef;
    double magicDef;
    int physAtt;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAtt * (1 - hero.physDef);
        if (hero.health - attack < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
