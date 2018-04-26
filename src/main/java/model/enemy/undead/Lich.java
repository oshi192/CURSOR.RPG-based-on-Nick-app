package model.enemy.undead;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Lich extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};

    public Lich() {
        super(Monsters.Undeads3);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
