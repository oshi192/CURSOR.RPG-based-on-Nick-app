package model.hero.dwarf.warrior;

import model.hero.AbstractAbility;
import model.hero.dwarf.warrior.abilities.map.WarriorAbilitiesMap;
import model.race.kind.impl.Dwarf;
import lombok.Getter;

import java.util.Map;

public class Warrior extends Dwarf {
    @Getter
    Map<String, Map<String, AbstractAbility>> specialAttacks = WarriorAbilitiesMap.getSpecialAttackMap();
    @Getter
    Map<String, int[]> attacks = WarriorAbilitiesMap.getAttackMap();

    public Warrior() {
        super("Warrior");
    }

    @Override
    public int attack() {
        return 0;
    }
}
