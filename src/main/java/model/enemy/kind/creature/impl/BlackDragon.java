package model.enemy.kind.creature.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.creature.Creatures;

public class BlackDragon extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {3, 10};

    public BlackDragon() {
        super("Creature", Creatures.BlackDragon.getName(), Creatures.BlackDragon.getHealth(),
                Creatures.BlackDragon.getInitiative(), Creatures.BlackDragon.getCost());

        this.setSpellImmune(true);
    }

    @Override
    public int attack() {
        // implement damage option, Spell immune
        return 0;
    }
}
