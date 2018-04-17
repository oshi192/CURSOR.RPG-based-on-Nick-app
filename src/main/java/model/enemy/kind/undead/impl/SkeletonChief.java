package model.enemy.kind.undead.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.undead.Undeads;

public class SkeletonChief extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public SkeletonChief() {
        super("Undead", Undeads.SkeletonChief.getName(), Undeads.SkeletonChief.getHealth(),
                Undeads.SkeletonChief.getInitiative(), Undeads.SkeletonChief.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
