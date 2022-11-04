package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListIteratorTest {

    ListIterator listIterator = new ListIterator();

    /* This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    public void testInit(){
        listIterator = new ListIterator();
    }

    /* Test to check listiterator has next after adding assignment*/
    @Test
    public void testHasNextTrue() {
        ArrayList<Object> testArrayList = new ArrayList<>();
        testArrayList.add(1);
        ListIterator listIterator = new ListIterator(testArrayList);
        assertTrue(listIterator.hasNext());
    }

    /* Test to check listiterator has next for false condition*/
    @Test
    public void testHasNextFalse() {
        ArrayList<Object> testArrayList = new ArrayList<>();
        ListIterator listIterator = new ListIterator(testArrayList);
        assertFalse(listIterator.hasNext());
    }

    /* Test to check if list iterator has next when new assignment has been added */
    @Test
    public void testNextTrue() {
        ArrayList<Object> testArrayList = new ArrayList<>();
        testArrayList.add(1);
        ListIterator listIterator = new ListIterator(testArrayList);
        assertEquals(1, listIterator.next());
    }

    /* Test to check if list iterator has next for null condition*/
    @Test
    public void testNextNull() {
        ArrayList<Object> testArrayList = new ArrayList<>();
        ListIterator listIterator = new ListIterator(testArrayList);
        assertNull(listIterator.next());
    }

    /*Test to remove arraylist of list iterator*/
    @Test
    void testRemove() {
        int value = 0;
        ArrayList<Object> testArrayList = new ArrayList<>();
        testArrayList.add(1);
        ListIterator listIterator = new ListIterator(testArrayList);
        listIterator.next();
        listIterator.remove();
        assertEquals(value, listIterator.getTheList().size());
    }

}