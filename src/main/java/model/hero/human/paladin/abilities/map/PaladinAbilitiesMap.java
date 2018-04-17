package model.hero.human.paladin.abilities.map;

import model.hero.AbstractAbility;
import model.hero.human.paladin.abilities.Rush;
import model.hero.human.paladin.abilities.Splash;

import java.util.HashMap;
import java.util.Map;

public class PaladinAbilitiesMap {

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

        int[] swordDamageOptions = {2, 10};

        attackMap.put("Attack with a sword", swordDamageOptions);

        return attackMap;
    }

    /**
     * @return Map <String, AbstractAbility>,
     * created map of skills
     */
    private static Map<String, AbstractAbility> createSkillsMap() {
        Map<String, AbstractAbility> skillsMap = new HashMap<>();

        skillsMap.put("Splash", new Splash());
        skillsMap.put("Rush", new Rush());

        return skillsMap;
    }
}
