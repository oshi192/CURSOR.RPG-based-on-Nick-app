package model.enemy.undead;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Banshee extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 10};

    public Banshee() {
        super(Monsters.Undeads1);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
