package lego.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

/**
 * Represents a LEGO set.
 */
@Builder
@Value
@With
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class LegoSet {

    /**
     * number (ID) of the set (unique key)
     */
    @EqualsAndHashCode.Include
    String number;
    /**
     * name of the set
     */
    String name;
    /**
     * pieces of the set
     */
    int pieces;
    /**
     * theme of the set
     */
    Theme theme;
    /**
     * minifigures of the set
     */
    List<Minifigure> minifigures;

    /**
     * Represents a minifigure.
     */
    @Builder
    @Value
    @With
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
    public static class Minifigure {
        /**
         * ID of the minifigure (unique key)
         */
        String id;
        /**
         * name of the minifigure
         */
        String name;
        /**
         * quantity of the minifigure
         */
        int quantity;
    }

    /**
     * Represents themes.
     */
    public enum Theme {

        /**
         * Represents theme City.
         */
        @JsonProperty("City") CITY,

        /**
         * Represents theme Harry Potter.
         */
        @JsonProperty("Harry Potter") HARRY_POTTER,

        /**
         * Represents theme Star Wars.
         */
        @JsonProperty("Star Wars") STAR_WARS,

        /**
         * Represents theme Creator Expert.
         */
        @JsonProperty("Creator Expert") CREATOR_EXPERT
    }
}
