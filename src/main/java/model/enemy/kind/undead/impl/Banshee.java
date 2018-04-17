package model.enemy.kind.undead.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.undead.Undeads;

public class Banshee extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 10};

    public Banshee() {
        super("Undead", Undeads.Banshee.getName(), Undeads.Banshee.getHealth(),
                Undeads.Banshee.getInitiative(), Undeads.Banshee.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
