package model.enemy.creature;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class Succubus extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {2, 6};
    private int coolDown = 4;

    public Succubus() {
        super(Monsters.Creatures6);
    }

    @Override
    public int attack() {
        // implement damage option, can cast fear
        return 0;
    }
}
