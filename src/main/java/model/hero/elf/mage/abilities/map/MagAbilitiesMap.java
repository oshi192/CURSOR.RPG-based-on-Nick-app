package model.hero.elf.mage.abilities.map;

import model.hero.AbstractAbility;
import model.hero.elf.mage.abilities.*;

import java.util.HashMap;
import java.util.Map;

public class MagAbilitiesMap {

    /**
     * @return created special attack map
     * with key appropriate key:
     * 'spells' or 'skills'
     */
    public static Map<String, Map<String, AbstractAbility>> getSpecialAttackMap() {
        Map<String, Map<String, AbstractAbility>> specialAttackMap = new HashMap<>();

        specialAttackMap.put("spells", createSpellsMap());

        return specialAttackMap;
    }

    /**
     * @return Map <String, int[]>
     * created map of regular attack
     */
    public static Map<String, int[]> getAttackMap() {
        return createAttackMap();
    }

    /**
     * @return Map <String, int[]>
     * created map of regular attack
     */
    private static Map<String, int[]> createAttackMap() {
        Map<String, int[]> attackMap = new HashMap<>();

        int[] damageOptions = {0, 6};
        int[] improvementOptions = {-6, -1};

        attackMap.put("Wizard Stuff", damageOptions);
        attackMap.put("Imposition of an improvement", improvementOptions);

        return attackMap;
    }

    /**
     * @return Map <String, AbstractAbility>,
     * created map of spells
     */
    private static Map<String, AbstractAbility> createSpellsMap() {
        Map<String, AbstractAbility> spellsMap = new HashMap<>();

        spellsMap.put("Fireball", new Fireball());
        spellsMap.put("Spell Shield", new SpellShield());
        spellsMap.put("Frost Bolt", new FrostBolt());
        spellsMap.put("Dispel", new Dispel());
        spellsMap.put("Stone Gaze", new StoneGaze());

        return spellsMap;
    }
}
