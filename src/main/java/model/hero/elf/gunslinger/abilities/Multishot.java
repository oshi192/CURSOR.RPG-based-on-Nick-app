package model.hero.elf.gunslinger.abilities;

import model.hero.AbstractAbility;

public class Multishot extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public Multishot() {
        super("Multishot", 30, DAMAGE_OPTIONS, 2);
    }

    @Override
    public void specialAbility() {
        // implement attack one additional target
    }
}
