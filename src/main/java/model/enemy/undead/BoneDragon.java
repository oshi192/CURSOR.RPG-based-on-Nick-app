package model.enemy.undead;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class BoneDragon extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {3, 10};

    public BoneDragon() {
        super(Monsters.Undeads2);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
