package model.hero.elf.mage.abilities;

import model.hero.AbstractAbility;

public class SpellShield extends AbstractAbility {

    public SpellShield() {
        super("Spell Shield", 15, null, 2);
    }

    @Override
    public void specialAbility() {
        // implement block 60 dmg till destruction
    }
}
