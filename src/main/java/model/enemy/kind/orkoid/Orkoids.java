package model.enemy.kind.orkoid;

import lombok.Getter;

@Getter
public enum Orkoids {
    Goblin("Goblin", 35, 20, 10),
    Ogre("Ogre", 300, 5, 100),
    Ork("Ork", 100, 30, 18),
    OrkShaman("Ork Shaman", 80, 35, 22),
    OrkWarlord("Ork Warlord", 150, 50, 40),
    UnstableAlchemist("Unstable Alchemist", 15, 25, 5);

    private String name;
    private int health;
    private int initiative;
    private int cost;

    Orkoids(String name, int health, int initiative, int cost) {
        this.name = name;
        this.health = health;
        this.initiative = initiative;
        this.cost = cost;
    }
}