package model.enemy.orkoid;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class OrkWarlord extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public OrkWarlord() {
        super(Monsters.Orkoids5);
    }

    @Override
    public int attack() {
        // implement damage option, with splash (hit 1 additional target)
        return 0;
    }
}
