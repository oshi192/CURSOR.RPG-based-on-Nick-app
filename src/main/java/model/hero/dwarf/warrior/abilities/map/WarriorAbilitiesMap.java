package model.hero.dwarf.warrior.abilities.map;

import model.hero.AbstractAbility;
import model.hero.dwarf.warrior.abilities.StandGround;
import model.hero.dwarf.warrior.abilities.WhirlingAxe;

import java.util.HashMap;
import java.util.Map;

public class WarriorAbilitiesMap {

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

        int[] axeDamageOptions = {2, 10};

        attackMap.put("Attack with a sword", axeDamageOptions);

        return attackMap;
    }

    /**
     * @return Map <String, AbstractAbility>,
     * created map of skills
     */
    private static Map<String, AbstractAbility> createSkillsMap() {
        Map<String, AbstractAbility> skillsMap = new HashMap<>();

        skillsMap.put("Whirling Axe", new WhirlingAxe());
        skillsMap.put("Stand my ground", new StandGround());

        return skillsMap;
    }
}
