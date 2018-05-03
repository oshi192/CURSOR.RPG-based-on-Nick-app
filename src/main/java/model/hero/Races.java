package model.hero;

import util.Colors;
import util.Console;

public enum Races implements Colors {

    R1("Elf",
            "Elves are a magical people of otherworldly grace, living in the world but not entirely part of it. " +
                    "They live in places of ethereal beauty, in the midst of ancient forests or in silvery spires " +
                    "glittering with faerie light, where soft music drifts through the air and gentle fragrances " +
                    "waft on the breeze. Elves love nature and magic, art and artistry, music and poetry, and the " +
                    "good things of the world.",
            new int[]{15, 10, 25, 22, 18}),
    R2("Human",
            "Kingdoms rich in ancient grandeur, halls carved into the roots of mountains, the echoing of picks " +
                    "and hammers in deep mines and blazing forges, a commitment to clan and tradition, and a " +
                    "burning hatred of goblins and orcs—these common threads unite all dwarves.",
            new int[]{10, 30, 20, 15, 15}),
    R3("Dwarf",
            "In the reckonings of most worlds, humans are the youngest of the common races, late to arrive " +
                    "on the world scene and short-lived in comparison to dwarves, elves, and dragons. " +
                    "Perhaps it is because of their shorter lives that they strive to achieve as much as they can " +
                    "in the years they are given. Or maybe they feel they have something to prove to the elder " +
                    "races, and that’s why they build their mighty empires on the foundation of conquest and trade. " +
                    "Whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds.",
            new int[]{5, 45, 15, 20, 5});

    public final String name;
    public final String description;
    public final int[] parameters;
    public static final String[] parametersNames = {"Charisma", "Stamina", "Intellect", "Agility", "Concentration"};

    Races(String name, String description, int[] parameters) {
        this.name = name;
        this.description = description;
        this.parameters = parameters;
    }

    public static void printRacesTable() {
        System.out.print(CYAN + "[0 - info] " + RESET);
        for (int i = 0; i < values().length; i++) {
            System.out.print("[" + (i + 1) + " - " + values()[i].name + "] ");
        }
        System.out.print(":");
    }

    public static void printRacesDescription() {
        for (int i = 0; i < values().length; i++) {
            Console.printParagraph(RED + values()[i].name + RESET + " : " + values()[i].description);
        }
    }


}
