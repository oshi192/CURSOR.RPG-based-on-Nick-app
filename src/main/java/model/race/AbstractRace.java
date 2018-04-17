package model.race;

import model.hero.AbstractAbility;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
public abstract class AbstractRace implements RaceInitValues, CalcConst {

    private String race;
    private String heroKind;

    @Setter
    private String heroName;

    private double health = RaceInitValues.initValue; // health points (hp)
    private boolean isLeader;

    @Setter
    private double xp = RaceInitValues.xp; // skill points (xp)

    private double mana = RaceInitValues.initValue; // manna point for spells (mp)
    private double rage = RaceInitValues.initValue; // rage points (rp)
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;

    @Setter
    private int level = RaceInitValues.level;

    /**
     * constructor for abstract
     * class AbstractRace
     *
     * @param race          race kind
     * @param heroKind      hero name
     * @param charisma      hero charisma
     * @param stamina       hero stamina
     * @param intellect     hero intellect
     * @param agility       hero agility
     * @param concentration hero concentration
     */
    public AbstractRace(String race,
                        String heroKind,
                        int charisma,
                        int stamina,
                        int intellect,
                        int agility,
                        int concentration) {

        this.race = race;
        this.heroKind = heroKind;
        this.charisma = charisma;
        this.stamina = stamina;
        this.intellect = intellect;
        this.agility = agility;
        this.concentration = concentration;
    }

    public void setLeader() {
        this.isLeader = true;
    }

    public void setHealth(int health) {
        this.health = health < RaceInitValues.minValue ? RaceInitValues.minValue : health;
    }

    public void setMana(int mana) {
        this.mana = mana < RaceInitValues.minValue ? RaceInitValues.minValue : mana;
    }

    public void setRage(int rage) {
        this.rage = rage < RaceInitValues.minValue ? RaceInitValues.minValue : rage;
    }

    public abstract int attack();

    public abstract Map<String, Map<String, AbstractAbility>> getSpecialAttacks();

    public abstract Map<String, int[]> getAttacks();


    public void setCharisma(int charisma) {
        this.charisma += charisma;

        // 2% XP gain for every two points
        int remainder = charisma % 2;
        this.xp += remainder == 0
                ? (increaseXPCoefficientPerCharisma * this.xp * charisma / 2)
                : (increaseXPCoefficientPerCharisma * this.xp * (charisma - remainder));

        // 1 additional initiative point per 2 points
        // CODE WILL BE HERE


        // charisma > 40 allows to fear enemies
        // (0.75% chance per 2 points of charisma)
        // CODE WILL BE HERE
    }

    public void setStamina(int stamina) {
        this.stamina += stamina;
        this.health += 2 * stamina + regenHPCoefficientPerStamina * this.health;
    }

    public void setIntellect(int intellect) {
        this.intellect += intellect;
        this.mana += 2 * intellect + regenMPCoefficientPerIntellect * this.mana;
    }

    public void setAgility(int agility) {
        this.agility += agility;
        this.rage += 4 * agility;

        // chance to avoid hit 1% per 2 points
        // CODE WILL BE HERE
    }

    public void setConcentration(int concentration) {
        this.concentration += concentration;
        this.health += increaseHPCoefficientPerConcentration * concentration;
        this.mana += increaseMPCoefficientPerConcentration * concentration;

        // 1 rp regen per 1 turn per 1 point
        // CODE WILL BE HERE

        // 1 turn cd decrease per 25 points
        // CODE WILL BE HERE
    }
}
