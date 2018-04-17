package model.hero.human.priest.abilities;

import model.hero.AbstractAbility;

public class BattleFury extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {0, 10};

    public BattleFury() {
        super("Battle Fury", 30, DAMAGE_OPTIONS, 3);
    }

    @Override
    public void specialAbility() {
        // hits every enemy with additional [2;6] damage
    }
}
