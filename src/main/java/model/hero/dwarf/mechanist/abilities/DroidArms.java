package model.hero.dwarf.mechanist.abilities;

import model.hero.AbstractAbility;

public class DroidArms extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public DroidArms() {
        super("Droid to arms", 25, DAMAGE_OPTIONS, 5);
    }

    @Override
    public void specialAbility() {
        // implement create droid that attack random enemy
        // lasts 3 turns, has 50 HP
    }
}
