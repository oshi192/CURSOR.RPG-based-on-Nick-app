package model.enemy.kind.creature.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.creature.Creatures;

public class Succubus extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};
    private int coolDown = 4;

    public Succubus() {
        super("Creature", Creatures.Succubus.getName(), Creatures.Succubus.getHealth(),
                Creatures.Succubus.getInitiative(), Creatures.Succubus.getCost());
    }

    @Override
    public int attack() {
        // implement damage option, can cast fear
        return 0;
    }
}
