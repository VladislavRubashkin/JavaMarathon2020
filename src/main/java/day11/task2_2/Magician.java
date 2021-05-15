package day11.task2_2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        this.physAtt = 5;
        this.physDef = 0.0;
        this.magicDef = 0.8;
        this.magicAtt = 20;
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
        return "Magician{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
