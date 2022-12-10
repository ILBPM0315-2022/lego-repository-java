package lego;

import lego.model.LegoSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Defines exercises.
 */
public interface Exercises {

    /**
     * Returns the greatest (maximum) value of pieces.
     *
     * @param legoSets the list of LEGO sets
     * @return the maximum of pieces
     */
    int getMaximumOfPieces(
            List<LegoSet> legoSets);


    /**
     * Returns the name of each LEGO set that belongs to the given theme.
     *
     * @param legoSets the list of LEGO sets
     * @param theme    the theme
     * @return the names
     */
    Set<String> getNamesOfSetsByTheme(
            List<LegoSet> legoSets,
            LegoSet.Theme theme);

    /**
     * Returns the list of LEGO sets ordered by:
     *
     * <ol>
     *     <li>the count of minifigures (descending)
     *     <li>the number (ascending)
     * </ol>
     *
     * @param legoSets the list of LEGO sets
     * @return the sorted list of LEGO sets
     */
    List<LegoSet> getSetsOrderByCountOfMinifiguresDescThenByNumber(
            List<LegoSet> legoSets);

    /**
     * Returns a dictionary that maps the number of each LEGO set to its theme.
     *
     * @param legoSets the list of LEGO sets
     * @return the dictionary
     */
    Map<String, LegoSet.Theme> getThemesByCodes(
            List<LegoSet> legoSets);

    /**
     * Returns a dictionary that groups the LEGO sets by their pieces.
     *
     * @param legoSets the list of LEGO sets
     * @return the dictionary
     */
    Map<Long, Set<LegoSet>> getSetsByPieces(
            List<LegoSet> legoSets);

    /**
     * Returns a dictionary that groups the LEGO sets by their themes, then their numbers to them.
     *
     * @param legoSets the list of LEGO sets
     * @return the dictionary
     */
    Map<LegoSet.Theme, Map<String, LegoSet>> getSetsByThemesAndNumbers(
            List<LegoSet> legoSets);
}
