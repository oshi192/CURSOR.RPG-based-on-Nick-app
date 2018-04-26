package model.enemy.orkoid;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Goblin extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Goblin() {
        super(Monsters.Orkoids1);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
