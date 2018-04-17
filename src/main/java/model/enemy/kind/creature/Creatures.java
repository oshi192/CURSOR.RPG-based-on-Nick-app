package model.enemy.kind.creature;

import lombok.Getter;

@Getter
public enum Creatures {
    BlackDragon("Black Dragon", 400, 50, 500),
    Doomguard("Doomguard", 60, 15, 15),
    DoomSpider("Doom Spider", 10, 5, 3),
    Imp("Imp", 30, 15, 10),
    Minotaur("Minotaur", 150, 40, 40),
    Succubus("Succubus", 100, 35, 35);

    private String name;
    private int health;
    private int initiative;
    private int cost;

    Creatures(String name, int health, int initiative, int cost) {
        this.name = name;
        this.health = health;
        this.initiative = initiative;
        this.cost = cost;
    }
}
