package model.hero.elf.mage.abilities;

import model.hero.AbstractAbility;

public class StoneGaze extends AbstractAbility {

    public StoneGaze() {
        super("Stone Gaze", 20, null, 4);
    }

    @Override
    public void specialAbility() {
        // implement transform enemy into stone
        // for 2 turns
    }
}
