package model.enemy.kind.orkoid.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.orkoid.Orkoids;

public class Ork extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public Ork() {
        super("Orkoid", Orkoids.Ork.getName(), Orkoids.Ork.getHealth(),
                Orkoids.Ork.getInitiative(), Orkoids.Ork.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
