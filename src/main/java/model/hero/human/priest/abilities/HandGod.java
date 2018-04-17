package model.hero.human.priest.abilities;

import model.hero.AbstractAbility;

public class HandGod extends AbstractAbility {

    public HandGod() {
        super("Hand God", 25, null, 2);
    }

    @Override
    public void specialAbility() {
        // implement heals 20 hits
        // (can be cast on itself or other unit,
        // if casts on UNDEAD deal damage instead heal)
    }
}
