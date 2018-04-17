package view;

import model.race.AbstractRace;
import model.team.Team;

public class TeamMessage implements MagicColors {
    /**
     * print info about Team
     *
     * @param team instance of Team
     */
    public static void printTeamInfo(Team team) {
        String leftAlignFormat = "| %-20s | %-20s | %-20s | %-20s |%n";
        System.out.println(CYAN + "\n\tTeam: " + team.getName() + RESET);
        printTeamTableHeader(leftAlignFormat, team.getHeroes());
        printTeamMemberInfo(leftAlignFormat, team.getHeroes());
    }


    /**
     * print header for table about Team
     *
     * @param format special format String
     * @param hero   array of heroes
     */
    private static void printTeamTableHeader(String format, AbstractRace[] hero) {
        printTeamTableDivider();
        System.out.format(format, "Characteristic\\Hero",
                hero[0].getHeroName() + " (L)", hero[1].getHeroName(), hero[2].getHeroName());
        printTeamTableDivider();
    }


    /**
     * divider in table about Team
     */
    private static void printTeamTableDivider() {
        System.out.format("+----------------------+----------------------+----------------------" +
                "+----------------------+%n");
    }


    /**
     * print info about Team members
     *
     * @param format special format String
     * @param hero   array of heroes
     */
    private static void printTeamMemberInfo(String format, AbstractRace[] hero) {

        printHeroesVitalCharacteristic(format, hero);
        printTeamTableDivider();

        printHeroesCharacteristic(format, hero);
        printTeamTableDivider();
    }


    /**
     * print info about vital characteristics of Team's heroes (Part #1)
     * (such as Profession, Health, Mana, Rage)
     *
     * @param format special format String
     * @param hero   array of heroes
     */
    private static void printHeroesVitalCharacteristic(String format, AbstractRace[] hero) {
        String doubleFormat = "| %-20s | %-20.2f | %-20.2f | %-20.2f |%n";

        System.out.format(format, "Profession",
                hero[0].getHeroKind() + "  (" + hero[0].getRace() + ")",
                hero[1].getHeroKind() + "  (" + hero[1].getRace() + ")",
                hero[2].getHeroKind() + "  (" + hero[2].getRace() + ")"
        );

        System.out.format(format, "Level",
                hero[0].getLevel(), hero[1].getLevel(), hero[2].getLevel());

        System.out.format(doubleFormat, "XP",
                hero[0].getXp(), hero[1].getXp(), hero[2].getXp());

        printTeamTableDivider();

        System.out.format(doubleFormat, "Health",
                hero[0].getHealth(), hero[1].getHealth(), hero[2].getHealth());

        System.out.format(doubleFormat, "Mana",
                hero[0].getMana(), hero[1].getMana(), hero[2].getMana());

        System.out.format(doubleFormat, "Rage",
                hero[0].getRage(), hero[1].getRage(), hero[2].getRage());
    }


    /**
     * print info about characteristics of Team's heroes (Part #2)
     * (such as Charisma, Stamina, Intellect, Agility, Concentration)
     *
     * @param format special format String
     * @param hero   special format String
     */
    private static void printHeroesCharacteristic(String format, AbstractRace[] hero) {
        System.out.format(format, "Charisma",
                hero[0].getCharisma(), hero[1].getCharisma(), hero[2].getCharisma());

        System.out.format(format, "Stamina",
                hero[0].getStamina(), hero[1].getStamina(), hero[2].getStamina());

        System.out.format(format, "Intellect",
                hero[0].getIntellect(), hero[1].getIntellect(), hero[2].getIntellect());

        System.out.format(format, "Agility",
                hero[0].getAgility(), hero[1].getAgility(), hero[2].getAgility());

        System.out.format(format, "Concentration",
                hero[0].getConcentration(), hero[1].getConcentration(), hero[2].getConcentration());
    }
}
