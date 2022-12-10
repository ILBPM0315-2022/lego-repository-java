package common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.NonNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a repository to obtain a list of objects. Data is read from a
 * static JSON file that contains an array of JSON objects. The file is loaded
 * via the classloader.
 *
 * @param <T> the type of the elements
 */
public final class Repository<T> {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().registerModule(new JavaTimeModule());
    private final List<T> entities;

    /**
     * Creates a {@code Repository} object to obtain a list of objects of
     * {@code elementClass}. The classloader of {@code elementClass} is used to
     * read JSON data.
     *
     * @param elementClass represents the type of the elements
     * @param resourceName the name of the resource that contains JSON data to
     *                     be read
     */
    public Repository(
            @NonNull final Class<T> elementClass,
            @NonNull final String resourceName) {
        try {
            final var type = OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, elementClass);
            this.entities = OBJECT_MAPPER.readValue(getClass().getClassLoader().getResourceAsStream(resourceName), type);
        } catch (IOException e) {
            e.printStackTrace();
            throw new AssertionError("Failed to load resource " + resourceName, e); // Can't happen
        }
    }

    /**
     * Returns the list of objects.
     *
     * @return the list of objects
     */
    public List<T> getAll() {
        return new ArrayList<>(this.entities);
    }

}