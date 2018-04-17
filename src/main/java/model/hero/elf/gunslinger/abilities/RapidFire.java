package model.hero.elf.gunslinger.abilities;

import model.hero.AbstractAbility;

public class RapidFire extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public RapidFire() {
        super("RapidFire", 30, DAMAGE_OPTIONS, 3);
    }

    @Override
    public void specialAbility() {
        // implement attack single target
        // with one additional attack
    }
}
