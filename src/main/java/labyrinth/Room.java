package labyrinth;

import lombok.Getter;
import lombok.Setter;
import model.enemy.AbstractMonster;
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

    Room(RoomDescription rd) {
        this.name = rd.name;
        this.doorSignboard = rd.doorSignboard;
        this.description = rd.description;
        enemysNumberHp = rd.coefficientOfHostility * AbstractMonster.MIDDLE_HEALTH_NUMBER;
        fillEnemies();
    }


    void addExit(Room r) {
        exits.add(r);
    }

    public void printExits() {
        int n = 1;
        for (Room r : exits) {
            System.out.println(GREEN + "\u2B9A" + RESET + "[" + n + "] " + r.getDoorSignboard());
            n++;
        }
    }

    private void fillEnemies() {
        //will be soon

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
            Console.printRandomLine(1, RED, false);
        }
        Console.printRandomLine(1, RED, false);
        Console.fillSpace(PARAGRAPH_LENGTH - 2, " ");
        Console.printRandomLine(1, RED, true);
    }

    public void printRoomInfo(){
        roomSignboard(name);
        Console.printParagraph(description);
    }
    private void roomSignboard(String name) {
        System.out.print(BLUE);
        Console.printRandomLine(PARAGRAPH_LENGTH,BLUE,true);
        String line =" "+name+" ";
        Console.printRandomLine(PARAGRAPH_LENGTH / 2 - line.length() / 2,BLUE,false);
        System.out.print(line);
        Console.printRandomLine((PARAGRAPH_LENGTH+1)/2 - (line.length()+1)/2,BLUE,true);
        Console.printRandomLine(PARAGRAPH_LENGTH,BLUE,true);
    }
}
