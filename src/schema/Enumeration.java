package schema;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * "This class maintains a list of the symbolic values that an enumeration is able to assume."
 * The NIST STEP Class Library pp 15.
 * Its is pragmatically similar to List<> with ascending priority that the more back
 * the symbol, i.e. an element, is , the more important it is.
 * <p>
 * Enumeartion<Type> can be used to realise union type (not built-in union type in C)
 *
 * @param <T>
 */
public class Enumeration<T> implements java.util.Enumeration {

    LinkedList<T> symbols;
    private int currentLocation;

    public Enumeration() {
        symbols = new LinkedList<T>();
        this.currentLocation = 0;
    }

    public Enumeration(List<T> symbols) {
        this.symbols = new LinkedList<T>(symbols);
    }


    /**
     * Tests if this enumeration contains more elements.
     *
     * @return {@code true} if and only if this enumeration object
     * contains at least one more element to provide;
     * {@code false} otherwise.
     */
    @Override
    public boolean hasMoreElements() {
        if (symbols.isEmpty()) {
            return false;
        } else {
            return currentLocation < symbols.size() - 1;
        }

    }

    /**
     * Returns the next element of this enumeration if this enumeration
     * object has at least one more element to provide.
     *
     * @return the next element of this enumeration.
     * @throws NoSuchElementException if no more elements exist.
     */
    @Override
    public T nextElement() {
        currentLocation++;
        return symbols.get(currentLocation);
    }

    public boolean addSymbol(T e) {
        return symbols.add(e);
    }

    public boolean removeSymbol(T e) {
        return symbols.remove(e);

    }

}
