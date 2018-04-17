package store.components;

import model.hero.elf.gunslinger.Gunslinger;
import model.hero.elf.mage.Mage;
import model.race.AbstractRace;

import java.util.LinkedHashMap;
import java.util.Map;

public class ElfHeroesMap {
    public static Map<String, AbstractRace> getElfHeroes() {
        Map<String, AbstractRace> raceHeroes = new LinkedHashMap<>();

        raceHeroes.put("mage", new Mage());
        raceHeroes.put("gunslinger", new Gunslinger());

        return raceHeroes;
    }
}
