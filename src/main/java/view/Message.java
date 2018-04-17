package view;

import model.race.AbstractRace;
import store.RaceMap;

import java.util.Map;
import java.util.Set;

public class Message implements MagicColors {
    private static Map<String, Map<String, AbstractRace>> raceMap = RaceMap.getRace();

    /**
     * message to ask name for something
     *
     * @param item something for which ask question
     */
    public static void askName(String item) {
        System.out.format("%sEnter %s: %s", BLUE, item, RESET);
    }


    /**
     * message to ask Team leader
     */
    public static void askHeroLeader() {
        System.out.println(BLUE + "Time to create your team" + RESET);
        System.out.println(PURPLE + "\n\tAt first choose a Leader" + RESET);
    }


    /**
     * message to ask more heroes to Team
     *
     * @param currentIndex current count of Team members
     * @param lastIndex    destination length of Team
     */
    public static void askMoreHero(int currentIndex, int lastIndex) {
        System.out.format("\n\t%s... needs more heroes (%d | %d)%s\n", PURPLE, currentIndex, lastIndex, RESET);
    }


    /**
     * print options to choose race
     */
    public static void printRaces() {
        String[] races = raceMap.keySet().toArray(new String[raceMap.keySet().size()]);

        for (int i = 0; i < races.length; i++) {
            races[i] = String.format("%s%d%s-%s", GREEN, i + 1, RESET, races[i]);
        }
        printOptions(races);
    }


    /**
     * print options to choose hero from particular race
     *
     * @param race race
     */
    public static void printRaceHeroes(String race) {
        Set<String> heroesKey = raceMap.get(race).keySet();
        String[] heroes = heroesKey.toArray(new String[heroesKey.size()]);

        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = String.format("%s%d%s-%s", GREEN, i + 1, RESET, heroes[i]);
        }
        printOptions(heroes);
    }


    /**
     * print options to choose characteristics needs to upgrade
     *
     * @param characteristicsKey array of characteristics name
     */
    public static void printKeyToUpgrade(String[] characteristicsKey) {
        for (int i = 0; i < characteristicsKey.length; i++) {
            characteristicsKey[i] = String.format("%s%d%s-%s", GREEN, i + 1, RESET, characteristicsKey[i]);
        }
        System.out.print("\n");
        printOptions(characteristicsKey);
    }


    /**
     * helper method, convert options from String[] to String and print
     *
     * @param options String[] of options
     */
    private static void printOptions(String[] options) {
        System.out.format("[%s] -> ",
                String.join(", ", options));
    }


    /**
     * print chosen option
     *
     * @param option chosen option
     */
    public static void printChosenOption(String option) {
        System.out.format("\t\t%sYour choice: %s%s\n", YELLOW, option, RESET);
    }


    /**
     * print remained point
     *
     * @param points remained points
     */
    public static void printRemainedPoints(int points) {
        System.out.format("You can distribute %d points: ", points);
    }


    /**
     * print total pointed should be distributed
     *
     * @param points total points to distribute
     */
    public static void printDistributionIntro(int points) {
        System.out.format("\t%sNow you should upgrade your hero. You have %d points for that%s\n", BLUE, points, RESET);
    }


    /**
     * print info when some characteristic upgraded
     *
     * @param points         points to upgrade
     * @param characteristic particular hero's characteristic
     * @param heroName       hero's name
     */
    public static void printUpgradeInfo(String points, String characteristic, String heroName) {
        System.out.format("\t\t%sYou add %s points to %s of %s%s\n", YELLOW, points, characteristic, heroName, RESET);
    }


    /**
     * print info that user has undistributed points
     *
     * @param remainedPoints count of undistributed points
     */
    public static void printRemainedInfo(int remainedPoints) {
        System.out.format("%s| You have %d points left |%s ", RED, remainedPoints, RESET);
    }
}