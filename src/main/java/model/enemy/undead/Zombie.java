package model.enemy.undead;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Zombie extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 6};

    public Zombie() {
        super(Monsters.Undeads6);
    }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
