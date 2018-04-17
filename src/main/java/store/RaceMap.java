package store;

import model.race.AbstractRace;
import store.components.DwarfHeroesMap;
import store.components.ElfHeroesMap;
import store.components.HumanHeroesMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class RaceMap {
    public static Map<String, Map<String, AbstractRace>> getRace() {
        Map<String, Map<String, AbstractRace>> races = new LinkedHashMap<>();

        races.put("human", HumanHeroesMap.getHumanHeroes());
        races.put("elf", ElfHeroesMap.getElfHeroes());
        races.put("dwarf", DwarfHeroesMap.getDwarfHeroes());

        return races;
    }
}
