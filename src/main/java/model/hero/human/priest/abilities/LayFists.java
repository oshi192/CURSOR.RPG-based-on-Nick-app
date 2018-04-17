package model.hero.human.priest.abilities;

import model.hero.AbstractAbility;

public class LayFists extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {0, 10};

    public LayFists() {
        super("Lay of Fists", 10, DAMAGE_OPTIONS, 3);
    }

    @Override
    public void specialAbility() {
        // hit multiple targets (from 2 to 3)
    }
}
