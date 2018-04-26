package model.enemy.undead;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Skeleton extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Skeleton() {
        super(Monsters.Undeads4);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
