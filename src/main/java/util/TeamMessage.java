package util;

import game.Team;
import util.Colors;

public class TeamMessage implements Colors {
    /**
     * print info about game.Team
     *
     * @param team instance of game.Team
     */
    public static void printTeamInfo(Team team) {
        String leftAlignFormat = "| %-20s | %-20s | %-20s | %-20s |%n";
        //System.out.println(CYAN + "\n\tgame.Team: " + team.getName() + RESET);
       // printTeamTableHeader(leftAlignFormat, team.getHeroes());
        //printTeamMemberInfo(leftAlignFormat, team.getHeroes());
    }



    /**
     * divider in table about game.Team
     */
    private static void printTeamTableDivider() {
        System.out.format("+----------------------+----------------------+----------------------" +
                "+----------------------+%n");
    }

    /**
     * print info about vital characteristics of game.Team's heroes (Part #1)
     * (such as Profession, Health, Mana, Rage)
     *
     * @param format special format String
     * @param hero   array of heroes
     */

}
