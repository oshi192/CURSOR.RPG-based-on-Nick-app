package model.hero.elf.mage;

import model.hero.AbstractAbility;
import model.hero.elf.mage.abilities.map.MagAbilitiesMap;
import model.race.kind.impl.Elf;
import lombok.Getter;

import java.util.Map;

public class Mage extends Elf {
    @Getter
    Map<String, Map<String, AbstractAbility>> specialAttacks = MagAbilitiesMap.getSpecialAttackMap();
    @Getter
    Map<String, int[]> attacks = MagAbilitiesMap.getAttackMap();

    public Mage() {
        super("Mage");
    }

    @Override
    public int attack() {
        return 0;
    }
}
