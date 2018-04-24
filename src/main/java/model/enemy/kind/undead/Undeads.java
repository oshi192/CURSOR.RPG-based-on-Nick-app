package model.enemy.kind.undead;

import lombok.Getter;

@Getter
public enum Undeads {

    Undeads1("Banshee", 75, 15, 15),
    Undeads2("Bone Dragon", 550, 50, 300),
    Undeads3("Lich", 100, 20, 25),
    Undeads4("Skeleton", 40, 10, 5),
    Undeads5("Skeleton Chief", 60, 15, 10),
    Undeads6("Zombie", 80, 5, 15);

    private String name;
    private int health;
    private int initiative;
    private int cost;
    public final static int MIN_HEALTH=40;
    Undeads(String name, int health, int initiative, int cost) {
        this.name = name;
        this.health = health;
        this.initiative = initiative;
        this.cost = cost;
    }
}
