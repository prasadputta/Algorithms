package prasad.algorithms;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by 153608 on 5/31/2017.
 */
public class QueueTest {


    @Test
    public void queueInsertion() {
        final Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        assertEquals("first", queue.remove());
        assertEquals("second", queue.remove());
        assertEquals("third", queue.peek());
        assertEquals("third", queue.remove());
    }

    @Test
    public void linkedHashMapTraversal() {
        final Map<Integer, String> counts = new LinkedHashMap<>();
        counts.put(4, "four");
        counts.put(1, "one");
        counts.put(3, "three");
        counts.put(2, "two");
        final Iterator<Integer> keys = counts.keySet().iterator();
        assertEquals(Integer.valueOf(4), keys.next());
        assertEquals(Integer.valueOf(1), keys.next());
        assertEquals(Integer.valueOf(3), keys.next());
        assertEquals(Integer.valueOf(2), keys.next());
        assertFalse(keys.hasNext());
    }


}
