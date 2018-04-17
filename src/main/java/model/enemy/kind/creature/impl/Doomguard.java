package model.enemy.kind.creature.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.creature.Creatures;

public class Doomguard extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Doomguard() {
        super("Creature", Creatures.Doomguard.getName(), Creatures.Doomguard.getHealth(),
                Creatures.Doomguard.getInitiative(), Creatures.Doomguard.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
