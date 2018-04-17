package model.hero.dwarf.mechanist.abilities;

import model.hero.AbstractAbility;

public class Bombs extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public Bombs() {
        super("Bombs!", 25, DAMAGE_OPTIONS, 2);
    }

    @Override
    public void specialAbility() {
        // implement throw a bomb that hits 2 enemies
    }
}
