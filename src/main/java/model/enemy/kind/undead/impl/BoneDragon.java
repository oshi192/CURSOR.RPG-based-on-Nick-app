package model.enemy.kind.undead.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.undead.Undeads;

public class BoneDragon extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {3, 10};

    public BoneDragon() {
        super("Undead", Undeads.BoneDragon.getName(), Undeads.BoneDragon.getHealth(),
                Undeads.BoneDragon.getInitiative(), Undeads.BoneDragon.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
