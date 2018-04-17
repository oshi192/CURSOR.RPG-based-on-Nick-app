package model.race.kind.impl;

import model.hero.AbstractAbility;
import model.race.AbstractRace;
import model.race.kind.Races;

import java.util.Map;

public class Dwarf extends AbstractRace {

    public Dwarf(String heroName) {
        super("Dwarf", heroName, Races.Dwarf.getCharisma(), Races.Dwarf.getStamina(), Races.Dwarf.getIntellect(),
                Races.Dwarf.getAgility(), Races.Dwarf.getConcentration());
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
