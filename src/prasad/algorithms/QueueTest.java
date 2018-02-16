package prasad.algorithms;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by 153608 on 5/31/2017.
 */
public class QueueTest {


    @Test
    public void queueInsertion() {
        final Queue<String> queue = new BlockingQueue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public void put(String s) throws InterruptedException {

            }

            @Override
            public boolean offer(String s, long timeout, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public String take() throws InterruptedException {
                return null;
            }

            @Override
            public String poll(long timeout, TimeUnit unit) throws InterruptedException {
                return null;
            }

            @Override
            public int remainingCapacity() {
                return 0;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int drainTo(Collection<? super String> c) {
                return 0;
            }

            @Override
            public int drainTo(Collection<? super String> c, int maxElements) {
                return 0;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
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
