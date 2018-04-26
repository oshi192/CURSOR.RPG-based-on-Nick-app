package model.enemy.creature;

import model.enemy.AbstractMonster;
import model.enemy.Monsters;

public class BlackDragon extends AbstractMonster {
    private static final int[] DAMAGE_OPTIONS = {3, 10};

    public BlackDragon() {
        super(Monsters.Creatures1);

        this.setSpellImmune(true);
    }

    @Override
    public int attack() {
        // implement damage option, Spell immune
        return 0;
    }
}
