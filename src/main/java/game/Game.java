package game;

import labyrinth.Dungeon;
import labyrinth.Room;
import model.team.Team;
import view.GeneralMessage;
import view.TeamMessage;

public class Game {
    private static Dungeon dungeon = new Dungeon();
    private static Team team;

    Game() {

    }

    public static void start() {
        //GeneralMessage.welcomeInfo();
        String teamName = " ";
        //String teamName = UserInteraction.askName("Team name");
        team = new Team(teamName, dungeon.getRooms().get(0));
        //TeamMessage.printTeamInfo(team);
        //dungeon.printMap();
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
