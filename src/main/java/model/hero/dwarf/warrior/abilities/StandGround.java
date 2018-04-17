package model.hero.dwarf.warrior.abilities;

import model.hero.AbstractAbility;

public class StandGround extends AbstractAbility {

    public StandGround() {
        super("Stand my ground", 20, null, 4);
    }

    @Override
    public void specialAbility() {
        // implement gain 50 HP shield for 2 turns
    }
}
