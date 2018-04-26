package model.enemy.creature;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Doomguard extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Doomguard() {
        super(Monsters.Creatures2);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
