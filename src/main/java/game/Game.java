package game;

import model.team.Team;
import view.GeneralMessage;
import view.TeamMessage;

public class Game {
    public static void start() {
        GeneralMessage.welcomeInfo();

        String teamName = UserInteraction.askName("Team name");

        Team team = new Team(teamName);
        TeamMessage.printTeamInfo(team);
    }
}
