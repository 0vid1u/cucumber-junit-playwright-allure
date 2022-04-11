package my.accelerator.atf.context;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ScenarioContext {
    private static final ThreadLocal<ConcurrentHashMap<ScenarioKeys, Object>> DATA_STORE = ThreadLocal.withInitial(ConcurrentHashMap::new);

    /**
     * @param key   - Key of the data entry
     * @param value - value of the Data entry
     */
    public synchronized void put(ScenarioKeys key, Object value) {
        if (key != null && value != null)  {
            DATA_STORE.get().put(key, value);
        }
    }

    /**
     * @param key - Key of the data entry whose value is needed
     * @return The value corresponding to the key. null if there is no value stored
     */
    public synchronized <T> T get(ScenarioKeys key) {
        if (key != null) {
            //noinspection unchecked
            return (T) DATA_STORE.get().get(key);
        }
        return null;
    }

    /**
     * Returns a {@link Set} view of the keys in datastore.
     * @return A set of keys stored in datastore
     */
    public synchronized Set<Object> items() {
        return Collections.unmodifiableSet(DATA_STORE.get().keySet());
    }

    /**
     * @param key - Key of the data entry to remove
     * @return The value of the entry removed. Null if no entry.
     */
    public synchronized Object remove(ScenarioKeys key) {
        if (key != null) {
            return DATA_STORE.get().remove(key);
        }
        return null;
    }

    public synchronized void clear() {
        DATA_STORE.get().clear();
    }
}
