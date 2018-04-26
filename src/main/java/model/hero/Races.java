package model.hero;

import util.Colors;

public enum Races implements Colors {

    R1("Elf", "Here will be the description of the race 1", new int[]{15, 10, 25, 22, 18}),
    R2("Human", "Here will be the description of the race 2", new int[]{10, 30, 20, 15, 15}),
    R3("Dwarf", "Here will be the description of the race 3", new int[]{5, 45, 15, 20, 5});

    public final String name;
    public final String description;
    public final int[] parameters;
    public static final String[] parametersNames = {"Charisma", "Stamina", "Intellect", "Agility", "Concentration"};

    Races(String name, String description, int[] parameters) {
        this.name = name;
        this.description = description;
        this.parameters = parameters;
    }
    public static void printRacesTable(){
        System.out.print(CYAN+"[0 - info] "+RESET);
        for(int i=0;i<values().length;i++){
            System.out.print("["+(i+1)+" - "+values()[i].name+"] ");
        }
        System.out.print(":");
    }

    public static void printRacesDescription(){
        for (int i = 0; i <values().length ; i++) {
            System.out.println(values()[i].name+" : "+values()[i].description);
        }
    }


}
