package model.hero.elf.gunslinger.abilities;

import model.hero.AbstractAbility;

public class BullsEye extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {3, 10};

    public BullsEye() {
        super("BullsEye", 40, DAMAGE_OPTIONS, 3);
    }

    @Override
    public void specialAbility() {
        // implement archer takes aim and
        // deal critical damage to single target
    }
}
