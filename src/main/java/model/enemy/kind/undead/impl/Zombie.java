package model.enemy.kind.undead.impl;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;
import model.enemy.kind.undead.Undeads;

public class Zombie extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Zombie() {
        super(Monsters.Undeads6);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
