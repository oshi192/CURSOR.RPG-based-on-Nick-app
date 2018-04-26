package model.enemy.creature;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Minotaur extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public Minotaur() {
        super(Monsters.Creatures5);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
