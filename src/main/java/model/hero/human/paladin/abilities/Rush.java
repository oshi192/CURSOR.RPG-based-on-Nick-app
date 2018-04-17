package model.hero.human.paladin.abilities;

import model.hero.AbstractAbility;

public class Rush extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {2, 10};

    public Rush() {
        super("Rush", 20, DAMAGE_OPTIONS, 0);
    }

    @Override
    public void specialAbility() {
        // implement dashes to nearest enemy
        // to deal additional [2;6] damage
    }
}
