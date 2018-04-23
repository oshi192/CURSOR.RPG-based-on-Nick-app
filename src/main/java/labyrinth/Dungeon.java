package labyrinth;

import util.Colors;
import util.Console;
import util.GameConstants;
import util.Validator;

import java.util.ArrayList;

public class Dungeon implements Colors, GameConstants {
    private ArrayList<Room> rooms;
    private int maxLength;

    public Dungeon() {
        rooms = new ArrayList<>();
        maxLength = LABYRINTH_MAIN_LINE_LENGTH + (int) (Math.random() * 3);
        dungeonGenerator();
    }

    private void dungeonGenerator() {
        createMainLine();
        for (int i = 0; i < LABYRINTH_SIDE_LINE_LENGTH; i++) {
            createSideline();
        }
    }

    private void createMainLine() {
        Room r1 = new Room(RoomDescription.START);
        Room r2;
        rooms.add(r1); //set start
        for (int i = 1; i < maxLength; i++) {
            int number1 = (int) (Math.random() * (RoomDescription.values().length - 2));
            r2 = new Room(RoomDescription.valueOf("R" + number1));
            setExits(r1, r2);
            rooms.add(r2);
            r1 = r2;
        }
        r2 = new Room(RoomDescription.EXIT);
        setExits(r1, r2);
        rooms.add(r2);//add exit
    }

    private void createSideline() {
        int j = (int) (Math.random() * (maxLength - 1)) + 1;
        Room r1 = rooms.get(j);
        for (int i = 0; i < Math.random() * 2 + 3; i++) {
            int number1 = (int) (Math.random() * (RoomDescription.values().length - 2));
            Room r2 = new Room(RoomDescription.valueOf("R" + number1));
            setExits(r1, r2);
            rooms.add(r2);
            r1 = r2;
        }
    }

    private void setExits(Room r1, Room r2) {
        r1.addExit(r2);
        r2.addExit(r1);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void printMap(){
        for(int i=0;i<maxLength;i++){
            System.out.print (rooms.get(i).getName()+" >>>> ");
            for(Room r:rooms.get(i).getExits()){
                System.out.print("["+r.getName()+"] ");
            }
            System.out.println();
        }
    }

}