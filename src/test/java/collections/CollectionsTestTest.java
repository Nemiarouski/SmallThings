package collections;

import org.junit.jupiter.api.Test;
import project.collections.list.CollectionsTest;
import static org.junit.jupiter.api.Assertions.*;

class CollectionsTestTest {

    @Test
    void listOf() {
        CollectionsTest collectionsTest = new CollectionsTest();
        assertEquals(31, collectionsTest.listOf());
    }

    @Test
    void dequeOf() {
    }

    @Test
    void linkedListOf() {
    }
}