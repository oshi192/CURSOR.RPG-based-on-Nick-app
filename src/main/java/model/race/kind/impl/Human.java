package model.race.kind.impl;

import model.hero.AbstractAbility;
import model.race.AbstractRace;
import model.race.kind.Races;

import java.util.Map;

public class Human extends AbstractRace {

    public Human(String heroName) {
        super("Human", heroName, Races.Human.getCharisma(), Races.Human.getStamina(), Races.Human.getIntellect(),
                Races.Human.getAgility(), Races.Human.getConcentration());
    }

    /**
     * @return int, damage point
     * functionality defined
     * in certain hero
     */
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public Map<String, Map<String, AbstractAbility>> getSpecialAttacks() {
        return null;
    }

    @Override
    public Map<String, int[]> getAttacks() {
        return null;
    }
}
