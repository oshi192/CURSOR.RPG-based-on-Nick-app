package model.hero;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractAbility {
    @Getter
    private String name;
    @Getter
    private int energyConsumption;
    @Getter
    private int[] damageOptions;
    @Getter
    @Setter
    private int coolDown;

    /**
     * constructor for abstract
     * class AbstractAbility
     * (some spells or skills)
     *
     * @param name              name of spell
     * @param energyConsumption how much mana / rage needs (mp/rp)
     * @param damageOptions     destruction options [min value, max value]
     * @param coolDown          pause for recovery (cd)
     */
    public AbstractAbility(String name,
                           int energyConsumption,
                           int[] damageOptions,
                           int coolDown) {

        this.name = name;
        this.energyConsumption = energyConsumption;
        this.damageOptions = damageOptions;
        this.coolDown = coolDown;
    }

    public abstract void specialAbility();
}
