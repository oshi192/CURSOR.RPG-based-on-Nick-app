package model.enemy.orkoid;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class OrkShaman extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};
    private static final int[] DAMAGE_OPTIONS_EXTRA = {2, 10};
    private int coolDown = 3;

    public OrkShaman() {
        super(Monsters.Orkoids4);
    }

    @Override
    public int attack() {
        // implement damage option, can cast 'bloodlust' on friendly ork
        // to improve his damage to [2;10]
        return 0;
    }
}
