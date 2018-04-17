package model.enemy.kind.undead.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.undead.Undeads;

public class Zombie extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Zombie() {
        super("Undead", Undeads.Zombie.getName(), Undeads.Zombie.getHealth(),
                Undeads.Zombie.getInitiative(), Undeads.Zombie.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
