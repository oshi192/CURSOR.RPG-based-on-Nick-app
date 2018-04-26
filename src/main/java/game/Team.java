package game;

import labyrinth.Room;
import lombok.Setter;
import model.hero.Hero;
import model.hero.Races;
import lombok.Getter;
import util.Colors;
import util.GameConstants;
import util.Validator;

import java.util.ArrayList;
import java.util.List;

public class Team implements Colors, GameConstants {
    @Getter
    private List<Hero> heroes = new ArrayList<>();
    @Getter
    private Room position;
    @Getter
    @Setter
    private Room previousPosition;

    public Team() {
        chooseMembers();
        chooseLeader();
        distributingPoints();
        position = Game.dungeon.getRooms().get(0);
        previousPosition = position;
    }

    /////////////////////////////////////// creating team //////////////////////////////////////////////////////////////
    private void chooseMembers() {
        for (int i = 0; i < NUMBER_OF_HEROES; i++) {
            chooseHero();
        }
    }

    private void chooseHero() {
        Races r = chooseHeroRace();
        Hero h = new Hero(r);
        heroes.add(h);
        System.out.println("Good choice! " + h.toStringRacesAndNames() + " joins your team!");
    }

    private Races chooseHeroRace() {
        int answer;
        do {
            System.out.println("choose your hero Race");
            Races.printRacesTable();
            answer = Validator.getNumber("", 0, Races.values().length);
            if (answer == 0) {
                Races.printRacesDescription();
            }
        } while (answer == 0);
        return Races.valueOf("R" + answer);
    }

    private void chooseLeader() {
        System.out.println("Time to  choose a leader: ");
        printMembersRacesAndNames();
        int numberLeader = Validator.getNumber("", 1, heroes.size());
        heroes.get(numberLeader - 1).setLeader(true);
    }

    private void distributingPoints() {
        for (Hero h : heroes) {
            h.distributingUpgradePoints();
        }
    }

    private void printMembersRacesAndNames() {
        for (int i = 0; i < heroes.size(); i++) {
            System.out.print("[" + (i + 1) + ":" + heroes.get(i).toStringRacesAndNames() + "] ");
        }
    }
    /////////////////////////////////////// end creating team //////////////////////////////////////////////////////////
    /////////////////////////////////////// battle phase and calculate xp //////////////////////////////////////////////

    void battlePhase() {
        if (position.getEnemysNumberHp() != 0) {
            position.printEnemiesInRoom();
            int sumXp = battle();
            distrybutionXp(sumXp);
            for (Hero h : heroes) {
                if (h.getUpgradePoints() > 0) {
                    h.distributingUpgradePoints();
                }
            }
        }
    }


    private int battle() {
        //I dont know what will do this method but he will return xp after battle actions
        return 0;
    }

    private void distrybutionXp(int sumXp) {
        int levelsSum = calculateSumLevels();
        for (Hero h : heroes) {
            h.levelUp(sumXp, levelsSum);
        }
    }

    private int calculateSumLevels() {
        int i = 0;
        for (Hero h : heroes) {
            i += h.getLevel();
        }
        return i;
    }

    /////////////////////////////////////// end battle phase and calculate xp //////////////////////////////////////////
    void chooseNextRoom(Room r) {
        int shift = r.printExits(previousPosition);
        int next = Validator.getNumber("move to: ", 1, r.getExits().size());
        r = r.getExits().get((next + shift - 1) % r.getExits().size());
        setPosition(r);
    }

    private void setPosition(Room position) {
        previousPosition = this.position;
        this.position = position;
    }


}
