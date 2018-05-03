package labyrinth;

import lombok.Getter;
import model.enemy.AbstractMonster;
import model.enemy.Monsters;
import model.enemy.MonstersConstants;
import util.Colors;
import util.Console;
import util.GameConstants;

import java.util.*;

public class Room implements Colors, GameConstants,MonstersConstants {

    @Getter
    private String name;
    @Getter
    public String description;
    @Getter
    public String doorSignboard;
    @Getter
    private int enemysNumberHp;
    private Random random = new Random();
    private List<AbstractMonster> enemies = new ArrayList<>();
    @Getter
    private List<Room> exits = new ArrayList<>();
    private Map<String, Integer> minMonstersHealth = new HashMap<>();
    private String monstersType;

    Room(RoomDescription rd) {
        this.name = rd.name;
        this.doorSignboard = rd.doorSignboard;
        this.description = rd.description;
        enemysNumberHp = rd.coefficientOfHostility * AbstractMonster.MIDDLE_HEALTH_NUMBER;
        this.monstersType = rd.monsterType;
        setMonstersHealth();
        fillEnemies();

    }
    /////////////////////////////////////// for constructor variables //////////////////////////////////////////////////

    private void setMonstersHealth() {
        minMonstersHealth.put("Undeads", MIN_UNDEAD_HEALTH);
        minMonstersHealth.put("Orkoids", MIN_ORKOIDS_HEALTH);
        minMonstersHealth.put("Creatures", MIN_CREATURES_HEALTH);
    }

    private void fillEnemies() {
        while (enemysNumberHp > chooseType(monstersType)) {
            String s = monstersType + (random.nextInt(6) + 1);
            Monsters monsters = Monsters.valueOf(s);
            if (enemysNumberHp > minMonstersHealth.get(monstersType)) {
                enemies.add(new AbstractMonster(monsters));
                enemysNumberHp -= monsters.health;
            }
        }
    }

    private int chooseType(String s) {
        int i;
        try {
            i = minMonstersHealth.get(s);
        } catch (NullPointerException e) {
            i = 0;
        }
        return i;
    }

    /////////////////////////////////////// end for constructor variables //////////////////////////////////////////////
    void addExit(Room r) {
        exits.add(r);
    }

    /////////////////////////////////////// printing room stuff ////////////////////////////////////////////////////////
    public void printRoomInfo() {
        roomSignboard(name);
        Console.printParagraph(description);
    }

    private void roomSignboard(String name) {
        System.out.print(BLUE);
        Console.printRandomLine(PARAGRAPH_LENGTH, BLUE, true);
        String line = " " + name + " ";
        Console.printRandomLine(PARAGRAPH_LENGTH / 2 - line.length() / 2, BLUE, false);
        System.out.print(line);
        Console.printRandomLine((PARAGRAPH_LENGTH + 1) / 2 - (line.length() + 1) / 2, BLUE, true);
        Console.printRandomLine(PARAGRAPH_LENGTH, BLUE, true);
    }

    public int printExits(Room previous) {
        int shift = random.nextInt(exits.size());
        for (int i = 0; i < exits.size(); i++) {
            int index = (shift + i) % exits.size();
            System.out.println(GREEN + "\u2B9A" + RESET + "[" + (i + 1) + "] " +
                    ((previous == exits.get(index)) ? GREEN + "(back) " + RESET : "") +
                    exits.get(index).getDoorSignboard());
        }
        return shift;
    }

    public void printEnemiesInRoom() {
        String line = " The phase of battle ";
        Console.printRandomLine(PARAGRAPH_LENGTH / 2 - line.length() / 2, RED, false);
        System.out.print(line);
        Console.printRandomLine((PARAGRAPH_LENGTH + 1) / 2 - (line.length() + 1) / 2, RED, true);
        printEnemies();
        Console.printRandomLine(PARAGRAPH_LENGTH, RED, true);
    }

    private void printEnemies() {
        Console.printRandomLine(1, RED, false);
        Console.fillSpace(PARAGRAPH_LENGTH - 2, " ");
        Console.printRandomLine(1, RED, true);
        for (AbstractMonster am : enemies) {
            Console.printRandomLine(1, RED, false);
            String line = " " + am.getName() + " ";
            System.out.print(line);
            Console.fillSpace(PARAGRAPH_LENGTH - line.length() - 2, " ");
            Console.printRandomLine(1, RED, true);
        }
        Console.printRandomLine(1, RED, false);
        Console.fillSpace(PARAGRAPH_LENGTH - 2, " ");
        Console.printRandomLine(1, RED, true);
    }
    /////////////////////////////////////// end printing room stuff ////////////////////////////////////////////////////

}
