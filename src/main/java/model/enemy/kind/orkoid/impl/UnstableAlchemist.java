package model.enemy.kind.orkoid.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.orkoid.Orkoids;

public class UnstableAlchemist extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 100};

    public UnstableAlchemist() {
        super("Orkoid", Orkoids.UnstableAlchemist.getName(), Orkoids.UnstableAlchemist.getHealth(),
                Orkoids.UnstableAlchemist.getInitiative(), Orkoids.UnstableAlchemist.getCost());
    }

    @Override
    public int attack() {
        // implement damage option, with splash (hit 1 additional target)
        return 0;
    }
}
