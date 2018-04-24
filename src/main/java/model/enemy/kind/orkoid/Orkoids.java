package model.enemy.kind.orkoid;

import lombok.Getter;

@Getter
public enum Orkoids {
    Orkoids1("Goblin", 35, 20, 10),
    Orkoids2("Ogre", 300, 5, 100),
    Orkoids3("Ork", 100, 30, 18),
    Orkoids4("Ork Shaman", 80, 35, 22),
    Orkoids5("Ork Warlord", 150, 50, 40),
    Orkoids6("Unstable Alchemist", 15, 25, 5);

    private String name;
    private int health;
    private int initiative;
    private int cost;
    public final static int MIN_ORKOIDS_HEALTH=15;
    Orkoids(String name, int health, int initiative, int cost) {
        this.name = name;
        this.health = health;
        this.initiative = initiative;
        this.cost = cost;
    }
}