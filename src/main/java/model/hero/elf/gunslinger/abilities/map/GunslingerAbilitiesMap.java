package model.hero.elf.gunslinger.abilities.map;

import model.hero.AbstractAbility;
import model.hero.elf.gunslinger.abilities.*;

import java.util.HashMap;
import java.util.Map;

public class GunslingerAbilitiesMap {

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

        int[] shootDamageOptions = {2, 6};
        int[] daggerDamageOptions = {0, 6};

        attackMap.put("Shoot from the bow", shootDamageOptions);
        attackMap.put("Attack with dagger", daggerDamageOptions);

        return attackMap;
    }

    /**
     * @return Map <String, AbstractAbility>,
     * created map of spells
     */
    private static Map<String, AbstractAbility> createSpellsMap() {
        Map<String, AbstractAbility> spellsMap = new HashMap<>();

        spellsMap.put("Multishot", new Multishot());
        spellsMap.put("RapidFire", new RapidFire());
        spellsMap.put("BullsEye", new BullsEye());

        return spellsMap;
    }
}
