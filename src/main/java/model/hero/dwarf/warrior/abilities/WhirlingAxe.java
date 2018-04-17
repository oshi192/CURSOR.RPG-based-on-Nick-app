package model.hero.dwarf.warrior.abilities;

import model.hero.AbstractAbility;

public class WhirlingAxe extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {2, 10};

    public WhirlingAxe() {
        super("Whirling Axe", 30, DAMAGE_OPTIONS, 2);
    }

    @Override
    public void specialAbility() {
        // implement throw axe into nearest enemy,
        // deal additional damage [2;6]
    }
}
