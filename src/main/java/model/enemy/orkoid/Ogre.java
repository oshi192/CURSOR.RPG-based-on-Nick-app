package model.enemy.orkoid;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Ogre extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 10};

    public Ogre() {
        super(Monsters.Orkoids2);
    }

    @Override
    public int attack() {
        // implement damage option, can stun 15% chance
        return 0;
    }
}
