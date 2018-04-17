package model.enemy.kind.orkoid.impl;

import model.enemy.AbstractMonster;
import model.enemy.kind.orkoid.Orkoids;

public class Goblin extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Goblin() {
        super("Orkoid", Orkoids.Goblin.getName(), Orkoids.Goblin.getHealth(),
                Orkoids.Goblin.getInitiative(), Orkoids.Goblin.getCost());
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
