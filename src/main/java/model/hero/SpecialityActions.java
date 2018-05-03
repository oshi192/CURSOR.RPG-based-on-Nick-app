package model.hero;

public enum SpecialityActions {
    ELF_S1_A0("Regular",
            0, 0, 1, 6, 0,
            "regular attack, can hold wizard stuff"),
    ELF_S1_A1("Fireball",
            45, 0, 3, 10, 3,
            "throw fireball in to enemy"),
    ELF_S1_A2("Spell shield",
            15, 0, 0, 0, 2,
            "Block 60 dmg till destruction"),
    ELF_S1_A3("Frost bolt",
            20, 0, 0, 0, 3,
            "throw frost bolt into enemy"),
    ELF_S1_A4("Dispell ",
            20, 0, 0, 10, 3,
            "Dispells any spell on chosen target"),
    ELF_S1_A5("Stone Gaze",
            45, 0, 3, 10, 3,
            "Transform enemy into stone for 2 turns"),
    ELF_S2_A1("Shoot from the bow",
            0, 0, 2, 6, 0,
            "Shoot from the bow - regular attack"),
    ELF_S2_A2("attack the enemy with dagger",
            0, 0, 0, 6, 0,
            "attack the enemy with dagger"),
/**/    ELF_S2_A3("Multishot",
            30, 0,  0, 0, 2,
            "attack 1 additional target,cd 2 turns"),
/**/    ELF_S2_A4("RapidFire",
            30, 0, 0, 0, 3,
            "attack single target with 1 additional attack, cd 3 turns"),
    ELF_S2_A5("BullsEye",
            40, 0, 3, 10, 3,
            "archer takes aim and deal crit damage to single target 3d10, cd 3 turns"),
    HUMAN_S1_A1("attack with fists",
            0, 0, 1, 10, 0,
            "attack with fists - regular attack"),
    HUMAN_S1_A2("Lay of Fists",
            0, 10, 1, 10, 3,
            "cd 3 turns, hits multiple targets (from 2 to 3)"),
    HUMAN_S1_A3("Battle Fury",
            0, 30, 2, 6, 4,
            "cd 4 turns, hits every enemy with additional 2d6 damage"),
/**/    HUMAN_S1_A4("Hand of God",
            25, 0, 0, 0, 2,
            "cd 2 turns, heals 20 hits (can be cast on itself or other unit, if casts on UNDEAD deal damage " +
                    "instead of heal)"),
    HUMAN_S1_A5("Battle trance",
            65, 0, 0, 0, 4,
            "cd 4 turns, gain immunity for next turn"),
    HUMAN_S2_A1("attack with a sword",
            0, 0, 2, 10, 0,
            "Attack with a sword - regular attack"),
    HUMAN_S2_A2("Splash",
            0, 20, 2, 10, 2,
            "Attack 2 additional targets"),
    HUMAN_S2_A3("Rush",
            0, 20, 2, 6, 0,
            "Dashes to nearest enemy to deal additional 2d6 damage"),
    DWARF_S1_A1("Attack with axe",
            0, 0, 2, 10, 0,
            "Attack with axe - regular attack"),
    DWARF_S1_A2("Whirling axe",
            0, 30, 2, 6, 2,
            "throw axe into nearest enemy, deal additional 2d6 damage, cd 2 turns, apply regular attack to this unit"),
    DWARF_S1_A3("Stand my ground",
            0, 20, 0, 0, 4,
            "cd 4 turns, gain 50 HP shield for 2 turns"),
    DWARF_S2_A1("Attack with gun",
            0, 0, 2, 6, 0,
            "Attack with gun - regular attack"),
    DWARF_S2_A2("Bombs!",
            0, 25, 2, 6, 2,
            "throw a bomb that hits 2 enemies and deal 2d6 dmg to each, cd 2 turns"),
    DWARF_S2_A3("Droid to arms",
            0, 0, 0, 0, 5,
            "crate droid that attack random enemy with 2d6 every turn, lasts 3 turns, cd 5 turns, has 50 HP");
    public final String name;
    public final String description;
    public final int mannaD;
    public final int rageD;
    public final int damageCount;
    public final int damageCube;
    public final int callDown;

    SpecialityActions(
            String name,
            int mannaD,
            int rageD,
            int damageCount,
            int damageCube,
            int callDown,
            String description) {
        this.name = name;
        this.mannaD = mannaD;
        this.rageD = rageD;
        this.damageCount = damageCount;
        this.damageCube = damageCube;
        this.callDown = callDown;
        this.description = description;
    }
}
