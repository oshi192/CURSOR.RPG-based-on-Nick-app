package model.enemy;

public enum Monsters {
    Undeads1("Banshee", 75, 15, 15),
    Undeads2("Bone Dragon", 550, 50, 300),
    Undeads3("Lich", 100, 20, 25),
    Undeads4("Skeleton", 40, 10, 5),
    Undeads5("Skeleton Chief", 60, 15, 10),
    Undeads6("Zombie", 80, 5, 15),
    Orkoids1("Goblin", 35, 20, 10),
    Orkoids2("Ogre", 300, 5, 100),
    Orkoids3("Ork", 100, 30, 18),
    Orkoids4("Ork Shaman", 80, 35, 22),
    Orkoids5("Ork Warlord", 150, 50, 40),
    Orkoids6("Unstable Alchemist", 15, 25, 5),
    Creatures1("Black Dragon", 400, 50, 500),
    Creatures2("Doomguard", 60, 15, 15),
    Creatures3("Doom Spider", 10, 5, 3),
    Creatures4("Imp", 30, 15, 10),
    Creatures5("Minotaur", 150, 40, 40),
    Creatures6("Succubus", 100, 35, 35);


    public final String name;
    public final int health;
    public final int initiative;
    public final int cost;
    public final static int MIN_ORKOIDS_HEALTH=40;
    public final static int MIN_UNDEAD_HEALTH=40;
    public final static int MIN_CREATURES_HEALTH=40;
    Monsters(String name, int health, int initiative, int cost) {
        this.name = name;
        this.health = health;
        this.initiative = initiative;
        this.cost = cost;
    }
}
