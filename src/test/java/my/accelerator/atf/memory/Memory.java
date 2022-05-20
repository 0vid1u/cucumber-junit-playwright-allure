package my.accelerator.atf.memory;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Memory {
    private static final ThreadLocal<ConcurrentHashMap<MemoryKeys, Object>> STORAGE = ThreadLocal.withInitial(ConcurrentHashMap::new);

    /**
     * @param key   - Key of the data entry
     * @param value - value of the Data entry
     */
    public synchronized void remember(MemoryKeys key, Object value) {
        if (key != null && value != null) {
            STORAGE.get().put(key, value);
        }
    }

    /**
     * @param key - Key of the data entry whose value is needed
     * @return The value corresponding to the key. null if there is no value stored
     */
    @SuppressWarnings("unchecked")
    public synchronized <T> T recall(MemoryKeys key) {
        if (key != null) {
            return (T) STORAGE.get().get(key);
        }
        return null;
    }

    /**
     * Returns a {@link Set} view of the keys in datastore.
     *
     * @return A set of keys stored in datastore
     */
    public synchronized Set<Object> items() {
        return Collections.unmodifiableSet(STORAGE.get().keySet());
    }

    /**
     * @param key - Key of the data entry to remove
     * @return The value of the entry removed. Null if no entry.
     */
    public synchronized Object remove(MemoryKeys key) {
        if (key != null) {
            return STORAGE.get().remove(key);
        }
        return null;
    }

    public synchronized void clear() {
        STORAGE.get().clear();
    }
}
