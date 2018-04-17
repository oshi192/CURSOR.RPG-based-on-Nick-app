package model.hero.human.priest.abilities.map;

import model.hero.AbstractAbility;
import model.hero.human.priest.abilities.BattleFury;
import model.hero.human.priest.abilities.BattleTrance;
import model.hero.human.priest.abilities.HandGod;
import model.hero.human.priest.abilities.LayFists;

import java.util.HashMap;
import java.util.Map;

public class PriestAbilitiesMap {

    /**
     * @return created special attack map
     * with key appropriate key:
     * 'spells' or 'skills'
     */
    public static Map<String, Map<String, AbstractAbility>> getSpecialAttackMap() {
        Map<String, Map<String, AbstractAbility>> specialAttackMap = new HashMap<>();

        specialAttackMap.put("spells", createSpellsMap());
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

        int[] fistsDamageOptions = {0, 10};

        attackMap.put("Attack with fists", fistsDamageOptions);

        return attackMap;
    }

    /**
     * @return Map <String, AbstractAbility>,
     * created map of spells
     */
    private static Map<String, AbstractAbility> createSpellsMap() {
        Map<String, AbstractAbility> spellsMap = new HashMap<>();

        spellsMap.put("Hand of God", new HandGod());
        spellsMap.put("Battle trance", new BattleTrance());

        return spellsMap;
    }

    /**
     * @return Map <String, AbstractAbility>,
     * created map of skills
     */
    private static Map<String, AbstractAbility> createSkillsMap() {
        Map<String, AbstractAbility> skillsMap = new HashMap<>();

        skillsMap.put("Lay of Fists", new LayFists());
        skillsMap.put("Battle Fury", new BattleFury());

        return skillsMap;
    }
}
