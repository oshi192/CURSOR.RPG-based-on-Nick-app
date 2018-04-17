package model.enemy.kind.creature.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.creature.Creatures;

public class DoomSpider extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 3};

    public DoomSpider() {
        super("Creature", Creatures.DoomSpider.getName(), Creatures.DoomSpider.getHealth(),
                Creatures.DoomSpider.getInitiative(), Creatures.DoomSpider.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
