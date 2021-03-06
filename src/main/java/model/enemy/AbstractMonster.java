package model.enemy;

import lombok.Getter;
import lombok.Setter;

@Getter
public class AbstractMonster {
    private static final int MIN_HEALTH = 0;
    public static final int MIDDLE_HEALTH_NUMBER = 120;

    @Setter
    private boolean spellImmune = false;

    private String kind;
    private String name; // name of monster in certain kind
    private int health;
    private int initiative;
    private int cost;

    public AbstractMonster(Monsters m) {
        this.kind = m.name();
        this.name = m.name;
        this.health = m.health;
        this.initiative = m.initiative;
        this.cost = m.cost;
    }

}
