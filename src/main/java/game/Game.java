package game;

import labyrinth.Dungeon;
import util.GeneralMessage;

public class Game {
    final static Dungeon dungeon = new Dungeon();
    private static Team team;

    Game() {

    }

    public static void start() {
        GeneralMessage.welcomeInfo();
        team = new Team();
        turn();
    }

    private static void turn() {
        String s = team.getPosition().getName();
        while (!"Exit".equals(s)) {
            team.getPosition().printRoomInfo();
            team.battlePhase();
            team.chooseNextRoom(team.getPosition());
            s = team.getPosition().getName();
        }
        System.out.println("You did it!!");
    }

}
