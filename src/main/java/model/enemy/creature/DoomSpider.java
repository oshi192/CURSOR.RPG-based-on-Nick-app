package model.enemy.creature;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class DoomSpider extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {0, 3};

    public DoomSpider() {
        super(Monsters.Creatures3);
        }

    @Override
    public int attack() {
        // implement damage option
        return 0;
    }
}
