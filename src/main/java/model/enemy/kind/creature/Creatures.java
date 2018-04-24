package model.enemy.kind.creature;

import lombok.Getter;

@Getter
public enum Creatures {
    Creatures1("Black Dragon", 400, 50, 500),
    Creatures2("Doomguard", 60, 15, 15),
    Creatures3("Doom Spider", 10, 5, 3),
    Creatures4("Imp", 30, 15, 10),
    Creatures5("Minotaur", 150, 40, 40),
    Creatures6("Succubus", 100, 35, 35);

    private String name;
    private int health;
    private int initiative;
    private int cost;
    public final static int MIN_HEALTH=10;
    Creatures(String name, int health, int initiative, int cost) {
        this.name = name;
        this.health = health;
        this.initiative = initiative;
        this.cost = cost;
    }
}
