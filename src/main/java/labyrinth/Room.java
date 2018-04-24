package labyrinth;

import lombok.Getter;
import model.enemy.AbstractMonster;
import model.enemy.Monsters;
import util.Colors;
import util.Console;
import util.GameConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Room implements Colors, GameConstants {

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
    private String monstersType;

    Room(RoomDescription rd) {
        this.name = rd.name;
        this.doorSignboard = rd.doorSignboard;
        this.description = rd.description;
        enemysNumberHp = rd.coefficientOfHostility * AbstractMonster.MIDDLE_HEALTH_NUMBER;
        this.monstersType = rd.monsterType;
        fillEnemies();
    }


    void addExit(Room r) {
        exits.add(r);
    }

    public int printExits(Room previous, Room position) {
        int shift = random.nextInt(exits.size());
        for (int i = 0; i < exits.size(); i++) {
            int index = (shift + i) % exits.size();
            System.out.println(GREEN + "\u2B9A" + RESET + "[" + (i + 1) + "] " +
                    ((!previous.getName().equals(position.getName()) &
                            previous.getName().equals(exits.get(index).getName())) ? GREEN + "(back) " + RESET : "") +
                    exits.get(index).getDoorSignboard());
        }
        return shift;
    }

    private void fillEnemies() {
        //will be soon
        while (enemysNumberHp > chooseType(monstersType)) {
            String s=monstersType + (random.nextInt(6) + 1);
            Monsters monsters = Monsters.valueOf(s);
            if (enemysNumberHp > chooseType(monstersType)) {
                enemies.add(new AbstractMonster(monsters) {
                    @Override
                    public int attack() {
                        return 0;
                    }
                });
                enemysNumberHp -= monsters.health;
            }
        }

    }

    private int chooseType(String s) {
        int i = 0;
        if ("Undeads".equals(s)) {
            i = Monsters.MIN_UNDEAD_HEALTH;
        }
        if ("Orkoids".equals(s)) {
            i = Monsters.MIN_ORKOIDS_HEALTH;
        }
        if ("Creatures".equals(s)) {
            i = Monsters.MIN_CREATURES_HEALTH;
        }
        return i;
    }

    public void printEnemies() {
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
}
