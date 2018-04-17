package model.enemy.kind.creature.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.creature.Creatures;

public class Imp extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Imp() {
        super("Creature", Creatures.Imp.getName(), Creatures.Imp.getHealth(),
                Creatures.Imp.getInitiative(), Creatures.Imp.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
