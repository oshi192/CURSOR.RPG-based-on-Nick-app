package game;

import labyrinth.Dungeon;
import util.GeneralMessage;

public class Game {
    static final Dungeon dungeon = new Dungeon();
    private static Team team;

    Game() {

    }

    public static void start() {
        GeneralMessage.welcomeInfo();
        team = new Team();
        turn();
    }

    private static void turn() {
        String s = team.getPosition().getRoomDescription().name;
        while (!"Exit".equals(s)) {
            team.getPosition().printRoomInfo();
            team.battlePhase();
            team.chooseNextRoom(team.getPosition());
            s = team.getPosition().getRoomDescription().name;
        }
        System.out.println("You did it!!");
    }

}
