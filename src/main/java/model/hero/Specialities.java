package model.hero;

import util.Colors;
import util.Console;

import java.util.Arrays;

public enum Specialities implements Colors {
    ELF_S1("Mage", "imposition of an improvement on the character of his unit can hold wizard Stuff, " +
            "can have various spells (requires manna consumption):",
            Arrays.stream(SpecialityActions.values())
                    .filter(x -> x.name().contains("ELF_S1"))
                    .toArray(SpecialityActions[]::new)),
    ELF_S2("Gunslinger", "Shoot from the bow, attack the enemy with dagger",
            Arrays.stream(SpecialityActions.values())
                    .filter(x -> x.name().contains("ELF_S2"))
                    .toArray(SpecialityActions[]::new)),
    HUMAN_S1("Priest/monk", "attack with fists ",
            Arrays.stream(SpecialityActions.values())
                    .filter(x -> x.name()
                    .contains("HUMAN_S1")).toArray(SpecialityActions[]::new)),
    HUMAN_S2("Paladin", "attack with a sword",
            Arrays.stream(SpecialityActions.values())
                    .filter(x -> x.name().contains("HUMAN_S2"))
                    .toArray(SpecialityActions[]::new)),
    DWARF_S1("Warrior", "Attack with axe",
            Arrays.stream(SpecialityActions.values())
                    .filter(x -> x.name().contains("DWARF_S1"))
                    .toArray(SpecialityActions[]::new)),
    DWARF_S2("Mechanist", "Attack with gun",
            Arrays.stream(SpecialityActions.values())
                    .filter(x -> x.name().contains("DWARF_S2"))
                    .toArray(SpecialityActions[]::new));
    public final String name;
    public final String description;
    public final SpecialityActions[] specialityActions;

    Specialities(String name, String description, SpecialityActions[] specialityActions) {
        this.name = name;
        this.description = description;
        this.specialityActions =  specialityActions;
    }

    public static void printSpecialities(String name) {
        System.out.print(CYAN + "[0 - info] " + RESET);
        Specialities [] spec= Arrays.stream(Specialities.values())
                .filter(x->x.name().contains(name.toUpperCase()))
                .toArray(Specialities[]::new);
        for (int i = 0; i < spec.length; i++) {
            System.out.print("[" + (i + 1) + " - " + spec[i].name + "] ");
        }
        System.out.print(":");
    }
    public static void printSpecialitiesDescription(String name){
        Specialities [] spec= Arrays.stream(Specialities.values())
                .filter(x->x.name().contains(name.toUpperCase()))
                .toArray(Specialities[]::new);
        for (int i = 0; i < spec.length; i++) {
            Console.printParagraph(values()[i].name + " : " + values()[i].description);
        }
    }

}
