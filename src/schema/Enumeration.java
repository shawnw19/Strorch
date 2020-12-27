package schema;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * "This class maintains a list of the symbolic values that an enumeration is able to assume."
 * The NIST STEP Class Library pp 15.
 * Its is pragmatically similar to List<> with descending priority that the more back
 * the symbol, i.e. an element, is , the less important it is.
 *
 * I hope Enumeartion<Type> can be used to realise union or intersection type (not built-in union type in C)
 *
 * @param <T>
 */
public class Enumeration<T> implements java.util.Enumeration {

    LinkedList<T> symbols = new LinkedList<T>();

    public Enumeration(LinkedList<T> symbols) {
        this.symbols = symbols;
    }

    private int currentLocation;

    /**
     * Tests if this enumeration contains more elements.
     *
     * @return {@code true} if and only if this enumeration object
     * contains at least one more element to provide;
     * {@code false} otherwise.
     */
    @Override
    public boolean hasMoreElements() {
        return currentLocation < symbols.size()-1;
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
        return symbols.get(currentLocation+1);
    }

}
