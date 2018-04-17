package model.enemy.kind.undead.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.undead.Undeads;

public class Skeleton extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Skeleton() {
        super("Undead", Undeads.Skeleton.getName(), Undeads.Skeleton.getHealth(),
                Undeads.Skeleton.getInitiative(), Undeads.Skeleton.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
