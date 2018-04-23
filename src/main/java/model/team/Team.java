package model.team;

import game.UserInteraction;
import labyrinth.Room;
import lombok.Setter;
import model.race.AbstractRace;
import lombok.Getter;
import util.Colors;
import util.Console;
import util.GameConstants;
import util.Validator;

public class Team implements Colors, GameConstants {
    private static final int TEAM_MEMBERS = 3;

    @Getter
    private AbstractRace[] heroes;
    @Getter
    private String name;
    @Getter
    private Room position;
    @Getter
    @Setter
    private Room previousPosition = null;

    // Create custom constructor to create Team
    public Team(String name, Room position) {
        //heroes = createTeam();
        this.name = name;
        this.position = position;
    }

    private AbstractRace[] createTeam() {
        AbstractRace[] selectedHeroes = UserInteraction.askHeroes(TEAM_MEMBERS);
        selectedHeroes[0].setLeader();
        return selectedHeroes;
    }

    @Override
    public String toString() {
        return String.format("\n\t%s team, members: %d\n\t\t--> %s",
                name, heroes.length, printTeamMembers());
    }

    // Function to print all members name in team
    private String printTeamMembers() {
        String[] heroesName = new String[heroes.length];

        for (int i = 0; i < heroes.length; i++) {
            heroesName[i] = String.format("%s (%.0f)", heroes[i].getHeroName(), heroes[i].getHealth());
        }

        return String.join(", ", heroesName);
    }

    public void battlePhase() {
        if (position.getEnemysNumberHp() != 0) {
            String line = " The phase of battle ";
            Console.printRandomLine(PARAGRAPH_LENGTH / 2 - line.length() / 2, RED, false);
            System.out.print(line);
            Console.printRandomLine((PARAGRAPH_LENGTH + 1) / 2 - (line.length() + 1) / 2, RED, true);
            position.printEnemies();
            Console.printRandomLine(PARAGRAPH_LENGTH, RED, true);

        }
    }

    public void setPosition(Room position) {
        previousPosition = this.position;
        this.position = position;
    }

    public void chooseNextRoom(Room r) {
        r.printExits();
        int next = Validator.getNumber("move to: ", 1, r.getExits().size()) - 1;
        position = r.getExits().get(next);
    }
}
