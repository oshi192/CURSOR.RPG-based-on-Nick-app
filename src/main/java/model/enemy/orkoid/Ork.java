package model.enemy.orkoid;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Ork extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public Ork() {
        super(Monsters.Orkoids3);

    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
