package model.enemy.kind.creature.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.creature.Creatures;

public class Minotaur extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public Minotaur() {
        super("Creature", Creatures.Minotaur.getName(), Creatures.Minotaur.getHealth(),
                Creatures.Minotaur.getInitiative(), Creatures.Minotaur.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
