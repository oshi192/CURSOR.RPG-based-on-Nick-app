package model.enemy.undead;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class SkeletonChief extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public SkeletonChief() {
        super(Monsters.Undeads5);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
