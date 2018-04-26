package model.hero;

import lombok.Getter;
import lombok.Setter;
import util.Colors;
import util.GameConstants;
import util.Validator;
import view.GeneralMessage;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Hero implements Colors, GameConstants/* implements Speciality*/ {
    private int level;
    private int dLevelUp;
    private int health;
    private int maxHealth;
    private int manna;
    private int rage;
    private int xp;
    private int chanceToAvoidHit;
    private boolean isLeader;
    private int upgradePoints;
    int initiative;
    private String name;
    private Races race;
    private Map<String, Integer> parameters = new HashMap<>();

    public Hero(Races race) {
        this.race = race;
        setParameters();
        setName();
        isLeader = false;
        upgradePoints = 10;
        xp = 0;
        recalculateParameters();
        level = 1;
        dLevelUp = 100;
    }
    ////////////////////////////////////// to creating object ///////////////////////////////////////////////////////////
    private void setParameters() {
        for (int i = 0; i < Races.parametersNames.length; i++) {
            parameters.put(Races.parametersNames[i], race.parameters[i]);
        }
    }

    private void setName() {
        String enumName = race.name.toUpperCase() + "_NAME" + (int) (Math.random() * HeroNames.values().length / 3);
        name = HeroNames.valueOf(enumName).name;
    }
    /////////////////////////////////////// end to creating object /////////////////////////////////////////////////////

    public String toStringRacesAndNames() {
        return name + " " + race.name;
    }

    /////////////////////////////////////// distribute upgrade points //////////////////////////////////////////////////
    public void distributingUpgradePoints() {
        while (upgradePoints > 0) {
            int i = chooseNumberParameter();
            int a = Validator.getNumber("enter quantity: ", 1, upgradePoints);
            upgradePoints -= a;
            a += parameters.get(Races.parametersNames[i - 1]);
            parameters.put(Races.parametersNames[i - 1], a);
        }
        recalculateParameters();
    }

    private int chooseNumberParameter() {
        int i;
        do {
            printParameters();
            i = Validator.getNumber("enter your variant: ", 0, Races.parametersNames.length);
            if (i == 0) {
                GeneralMessage.characteristicsInfo();
            }
        } while (i == 0);
        return i;
    }

    private void printParameters() {
        System.out.print(BLUE + "upgrade hero: " + YELLOW + name + ". " + BLUE);
        System.out.println(" you have " + PURPLE + upgradePoints + BLUE + " points" + RESET);
        System.out.print(GREEN + "[0 : info] ");
        for (int i = 0; i < Races.parametersNames.length; i++) {
            String parameterName = Races.parametersNames[i];
            System.out.print("[" + (i + 1) + ": " + parameterName + " " + parameters.get(parameterName) + "] ");
        }
        System.out.println(RESET);
    }

    ////////////////////////////////////////end distribute upgrade points //////////////////////////////////////////////
    /////////////////////////////////////// level up and recalculate parameters ////////////////////////////////////////
    public void levelUp(int sumXp, int sumLvls) {
        this.xp += calculateXp(sumXp);
        if (this.xp >= dLevelUp & level <= MAX_LEVEL) {
            level++;
            this.xp -= dLevelUp;
            dLevelUp = dLevelUp * (100 - sumLvls) / 100 + dLevelUp;
            upgradePoints=10;
        }
    }

    private int calculateXp(int xp) {
        int result = 0;
        result += (int) ((isLeader ? xp * 0.4 : 0.3) * parameters.get("Charisma") / 100);
        return result;
    }
    private void recalculateParameters(){
        health = parameters.get("Stamina")*2;//0.25 helth regen
        manna = parameters.get("Intellect")*2;//0.25 manna regen
        rage = parameters.get("Agility")*4;
        chanceToAvoidHit = parameters.get("Agility")/2;
        initiative = parameters.get("Charisma")/2;
        //"Concentration"
    }
    /////////////////////////////////////// end level up and recalculate parameters ////////////////////////////////////
}
