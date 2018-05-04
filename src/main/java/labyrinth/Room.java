package labyrinth;

import lombok.Getter;
import model.enemy.AbstractMonster;
import model.enemy.Monsters;
import util.Colors;
import util.Console;
import util.GameConstants;

import java.util.*;

public class Room implements Colors, GameConstants {

    @Getter
    private int enemiesNumberHp;
    private Random random = new Random();
    private List<AbstractMonster> enemies;
    @Getter
    private List<Room> exits = new ArrayList<>();
    @Getter
    private RoomDescription roomDescription;

    Room(RoomDescription roomDescription) {
        this.roomDescription = roomDescription;
        enemiesNumberHp = roomDescription.coefficientHostility * AbstractMonster.MIDDLE_HEALTH_NUMBER;
    }
    /////////////////////////////////////// Create monsters ////////////////////////////////////////////////////////////

    public void monstersGenerator(int lvlSum) {
        if (roomDescription.coefficientHostility != 0) {
            enemies = new ArrayList<>();
            Monsters[] monsters = avaibleMonsters();
            int startInex = (lvlSum - NUMBER_OF_HEROES) * (monsters.length - 1)
                    / (MAX_LEVEL * NUMBER_OF_HEROES - NUMBER_OF_HEROES);
            int enHp = enemiesNumberHp + (lvlSum - NUMBER_OF_HEROES) * roomDescription.coefficientHostility;
            while (enHp >= monsters[0].health) {
                int index = random.nextInt(startInex);
                if (enHp >= monsters[index].health) {
                    enemies.add(new AbstractMonster(monsters[index]));
                    enHp -= monsters[index].health;
                }
            }
        }
    }

    private Monsters[] avaibleMonsters() {
        return Arrays.stream(Monsters.values())
                .filter(x -> x.name().contains(roomDescription.monsterType))
                .sorted(Comparator.comparing(Monsters::getHealth))
                .toArray(Monsters[]::new);
    }

    /////////////////////////////////////// end  Create monsters ///////////////////////////////////////////////////////
    void addExit(Room r) {
        exits.add(r);
    }

    /////////////////////////////////////// printing room stuff ////////////////////////////////////////////////////////
    public void printRoomInfo() {
        roomSignboard(roomDescription.name);
        Console.printParagraph(roomDescription.description);
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
                    exits.get(index).getRoomDescription().doorSignboard);
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
