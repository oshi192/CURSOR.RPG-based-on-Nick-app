package model.enemy.kind.orkoid.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.orkoid.Orkoids;

public class OrkWarlord extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public OrkWarlord() {
        super("Orkoid", Orkoids.OrkWarlord.getName(), Orkoids.OrkWarlord.getHealth(),
                Orkoids.OrkWarlord.getInitiative(), Orkoids.OrkWarlord.getCost());
    }

    @Override
    public int attack() {
        // implement damage option, with splash (hit 1 additional target)
        return 0;
    }
}
