package model.team;

import game.UserInteraction;
import model.race.AbstractRace;
import lombok.Getter;

public class Team {
    private static final int TEAM_MEMBERS = 3;

    @Getter
    private AbstractRace[] heroes;
    @Getter
    private String name;

    // Create custom constructor to create Team
    public Team(String name) {
        heroes = createTeam();
        this.name = name;
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
}
