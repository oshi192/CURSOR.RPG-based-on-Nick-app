package game;

import model.race.AbstractRace;
import store.RaceMap;
import view.ErrorMessage;
import view.GeneralMessage;
import view.Message;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserInteraction {
    private static final Scanner in = new Scanner(System.in);

    /**
     * ask about name (for props, that validate
     * only for empty field)
     *
     * @return name of some property
     */
    public static String askName(String item) {
        Message.askName(item);

        while (true) {
            String userInput = in.nextLine().toUpperCase().trim();

            if (!userInput.isEmpty()) {
                return userInput;
            }
            ErrorMessage.errorEmptyInput();
        }
    }


    /**
     * choose some item from list by options
     * (validate input)
     *
     * @param items String[]
     * @return chosen option
     */
    private static int chooseOption(String[] items) {
        while (true) {
            String userInput = in.nextLine();

            if (!userInput.isEmpty() && userInput.matches("\\d+")) {
                int option = Integer.parseInt(userInput);

                if (option >= 1 && option <= items.length) {
                    return option - 1;
                }
            }

            ErrorMessage.errorInfo();
        }
    }


    /**
     * ask about race for heroes
     *
     * @return name of race
     */
    private static String askRace() {
        Set<String> racesKey = RaceMap.getRace().keySet();
        String[] races = racesKey.toArray(new String[racesKey.size()]);

        Message.askName("race");
        Message.printRaces();
        int option = chooseOption(races);

        Message.printChosenOption(races[option]);

        return races[option];
    }


    /**
     * ask about about hero
     *
     * @param heroesMap map of heroes for particular race
     * @param race      race
     * @return chosen hero
     */
    private static AbstractRace askHero(Map<String, AbstractRace> heroesMap, String race) {
        Set<String> heroesKey = heroesMap.keySet();
        String[] heroes = heroesKey.toArray(new String[heroesKey.size()]);

        Message.askName("hero");
        Message.printRaceHeroes(race);
        int option = chooseOption(heroes);

        Message.printChosenOption(heroes[option]);

        return heroesMap.get(heroes[option]);
    }


    /**
     * ask about team members (can be from different races)
     *
     * @param teamMembers heroes number in team
     * @return array of heroes
     */
    public static AbstractRace[] askHeroes(int teamMembers) {
        ArrayList<AbstractRace> teamHeroes = new ArrayList<>();

        Message.askHeroLeader();

        while (teamHeroes.size() < teamMembers) {
            initializeHero(teamHeroes);

            int currentTeamSize = teamHeroes.size();

            if (currentTeamSize < teamMembers) {
                Message.askMoreHero(currentTeamSize, teamMembers);
            }
        }

        return teamHeroes.toArray(new AbstractRace[teamHeroes.size()]);
    }


    /**
     * initialize hero with name of the particular race
     *
     * @param teamHeroes team
     */
    private static void initializeHero(ArrayList<AbstractRace> teamHeroes) {
        Map<String, Map<String, AbstractRace>> raceMap = RaceMap.getRace();

        String name = askName("hero name");
        String race = askRace();
        AbstractRace hero = askHero(raceMap.get(race), race);
        hero.setHeroName(name);

        distributePoints(hero);

        teamHeroes.add(hero);
    }


    /**
     * distribute point to upgrade from total points
     *
     * @param hero instance of particular hero
     */
    private static void distributePoints(AbstractRace hero) {
        int remainedPoints = (int) hero.getXp();
        Message.printDistributionIntro(remainedPoints);

        while (remainedPoints > 0) {
            String characteristic = askKeyToUpgrade(hero.keyToUpgrade);

            Message.printRemainedPoints(remainedPoints);

            remainedPoints = upgradeHeroKey(remainedPoints, characteristic, hero);
        }
    }


    /**
     * ask for particular hero's characteristic
     *
     * @param options array of options
     * @return chosen option
     */
    private static String askKeyToUpgrade(String[] options) {
        int option;

        do {
            Message.askName("characteristic to upgrade");
            Message.printKeyToUpgrade(options.clone());

            option = chooseOption(options);

            if ("INFO".equals(options[option])) {
                GeneralMessage.characteristicsInfo();
            }
        } while ("INFO".equals(options[option]));

        Message.printChosenOption(options[option]);
        return options[option];
    }


    /**
     * upgrade particular hero's characteristic
     *
     * @param remainedPoints total points
     * @param characteristic concrete key needs to upgrade
     * @param hero           instance of particular hero
     * @return remained points
     */
    private static int upgradeHeroKey(int remainedPoints, String characteristic, AbstractRace hero) {
        while (true) {
            String userInput = in.nextLine();
            if (!userInput.isEmpty()
                    && userInput.matches("\\d+")
                    && parseInt(userInput) > 0
                    && parseInt(userInput) <= remainedPoints) {

                updateXp(hero, parseInt(userInput));
                upgradeCharacteristic(characteristic, hero, parseInt(userInput));
                remainedPoints -= parseInt(userInput);
                Message.printUpgradeInfo(userInput, characteristic, hero.getHeroName());

                if (remainedPoints != 0) Message.printRemainedInfo(remainedPoints);
                return remainedPoints;

            } else {
                ErrorMessage.errorOutOfBound(remainedPoints);
            }
        }
    }


    /**
     * update hero XP
     *
     * @param hero      current hero
     * @param userInput input value
     */
    private static void updateXp(AbstractRace hero, int userInput) {
        hero.setXp(hero.getXp() - (double) userInput);
    }


    /**
     * upgrade particular characteristic
     *
     * @param characteristic concrete key needs to upgrade
     * @param hero           instance of particular hero
     * @param points         upgrade points
     */
    private static void upgradeCharacteristic(String characteristic, AbstractRace hero, int points) {
        if("charisma".equals(characteristic)) hero.setCharisma(points);
        if("stamina".equals(characteristic)) hero.setStamina(points);
        if("intellect".equals(characteristic)) hero.setIntellect(points);
        if("agility".equals(characteristic)) hero.setAgility(points);
        if("concentration".equals(characteristic)) hero.setConcentration(points);
    }


    /**
     * helper function to parse String to int
     *
     * @param number string that represented number
     * @return integer
     */
    private static int parseInt(String number) {
        return Integer.parseInt(number);
    }
}
