package model.race.kind;

import lombok.Getter;

@Getter
public enum Races {
    Dwarf(5, 45, 15, 20, 5),
    Elf(15, 10, 25, 22, 18),
    Human(10, 30, 20, 15, 15);

    int charisma;
    int stamina;
    int intellect;
    int agility;
    int concentration;

    Races(int charisma, int stamina, int intellect, int agility, int concentration) {
        this.charisma = charisma;
        this.stamina = stamina;
        this.intellect = intellect;
        this.agility = agility;
        this.concentration = concentration;
    }
}
