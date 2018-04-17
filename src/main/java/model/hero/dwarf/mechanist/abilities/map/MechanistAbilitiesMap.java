package model.hero.dwarf.mechanist.abilities.map;

import model.hero.AbstractAbility;
import model.hero.dwarf.mechanist.abilities.Bombs;
import model.hero.dwarf.mechanist.abilities.DroidArms;

import java.util.HashMap;
import java.util.Map;

public class MechanistAbilitiesMap {

    /**
     * @return created special attack map
     * with key appropriate key:
     * 'spells' or 'skills'
     */
    public static Map<String, Map<String, AbstractAbility>> getSpecialAttackMap() {
        Map<String, Map<String, AbstractAbility>> specialAttackMap = new HashMap<>();

        specialAttackMap.put("skills", createSkillsMap());

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

        int[] gunDamageOptions = {2, 6};

        attackMap.put("Attack with a gun", gunDamageOptions);

        return attackMap;
    }

    /**
     * @return Map <String, AbstractAbility>,
     * created map of skills
     */
    private static Map<String, AbstractAbility> createSkillsMap() {
        Map<String, AbstractAbility> skillsMap = new HashMap<>();

        skillsMap.put("Bombs!", new Bombs());
        skillsMap.put("Droid to arms", new DroidArms());

        return skillsMap;
    }
}
