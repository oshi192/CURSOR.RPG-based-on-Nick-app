package store.components;

import model.hero.dwarf.mechanist.Mechanist;
import model.hero.dwarf.warrior.Warrior;
import model.race.AbstractRace;

import java.util.LinkedHashMap;
import java.util.Map;

public class DwarfHeroesMap {
    public static Map<String, AbstractRace> getDwarfHeroes() {
        Map<String, AbstractRace> raceHeroes = new LinkedHashMap<>();

        raceHeroes.put("warrior", new Warrior());
        raceHeroes.put("mechanist", new Mechanist());

        return raceHeroes;
    }
}
