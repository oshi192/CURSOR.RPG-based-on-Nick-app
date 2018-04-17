package model.enemy.kind.undead;

import lombok.Getter;

@Getter
public enum Undeads {
    Banshee("Banshee", 75, 15, 15),
    BoneDragon("Bone Dragon", 550, 50, 300),
    Lich("Lich", 100, 20, 25),
    Skeleton("Skeleton", 40, 10, 5),
    SkeletonChief("Skeleton Chief", 60, 15, 10),
    Zombie("Zombie", 80, 5, 15);

    private String name;
    private int health;
    private int initiative;
    private int cost;

    Undeads(String name, int health, int initiative, int cost) {
        this.name = name;
        this.health = health;
        this.initiative = initiative;
        this.cost = cost;
    }
}
