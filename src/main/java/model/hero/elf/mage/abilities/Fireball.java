package model.hero.elf.mage.abilities;

import model.hero.AbstractAbility;

public class Fireball extends AbstractAbility {

    private static final int[] DAMAGE_OPTIONS = {3, 10};

    public Fireball() {
        super("Fireball", 45, DAMAGE_OPTIONS, 3);
    }

    @Override
    public void specialAbility() {
    }
}
