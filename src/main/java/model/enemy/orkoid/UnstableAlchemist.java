package model.enemy.orkoid;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;


public class UnstableAlchemist extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 100};

    public UnstableAlchemist() {
        super(Monsters.Orkoids6);
    }

    @Override
    public int attack() {
        // implement damage option, with splash (hit 1 additional target)
        return 0;
    }
}
