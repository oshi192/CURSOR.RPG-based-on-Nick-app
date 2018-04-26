package model.enemy.creature;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Imp extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Imp() {
        super(Monsters.Creatures4);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
