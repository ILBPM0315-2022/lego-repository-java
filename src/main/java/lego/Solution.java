package lego;

import common.Repository;
import lego.model.LegoSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution implements Exercises {
    @Override
    public int getMaximumOfPieces(List<LegoSet> legoSets) {
        return 0; // TODO
    }

    @Override
    public Set<String> getNamesOfSetsByTheme(List<LegoSet> legoSets, LegoSet.Theme theme) {
        return null; // TODO
    }

    @Override
    public List<LegoSet> getSetsOrderByCountOfMinifiguresDescThenByNumber(List<LegoSet> legoSets) {
        return null; // TODO
    }

    @Override
    public Map<String, LegoSet.Theme> getThemesByCodes(List<LegoSet> legoSets) {
        return null; // TODO
    }

    @Override
    public Map<Long, Set<LegoSet>> getSetsByPieces(List<LegoSet> legoSets) {
        return null; // TODO
    }

    @Override
    public Map<LegoSet.Theme, Map<String, LegoSet>> getSetsByThemesAndNumbers(List<LegoSet> legoSets) {
        return null; // TODO
    }

    public static void main(String[] args) {
        Repository<LegoSet> repository = new Repository<>(LegoSet.class, "legosets.json");
        repository.getAll().forEach(System.out::println);
    }
}
