package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionIteratorTest {
    Solution solution;
    SolutionList solutionList;

    /*This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    void testInit(){
        solution = new Solution();
        solutionList = new SolutionList();
    }

    /* Test to check if solution iterator has next when new solution has been added */
    @Test
    public void testNext() {
        solution.solutionFileName = "Loka";
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        Solution testSolution = (Solution) solutionIterator.next();
        assertEquals(solution.solutionFileName, testSolution.solutionFileName);
    }

    /* Test whether solution iterator becomes null when no solution is given */
    @Test
    public void testNextNull() {
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        Solution solution = (Solution) solutionIterator.next();
        assertNull(solution);
    }

    /*Test if solution iterator has next when solution is added*/
    @Test
    public void testHasNext() {
        solution.solutionFileName = "Loka";
        solutionList.add(solution);
        SolutionIterator test = new SolutionIterator(solutionList);
        assertEquals(true, test.hasNext());
    }

    /* Test if solution iterator has next when given empty solution list */
    @Test
    public void testHasNextNull() {
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        assertEquals(false, solutionIterator.hasNext());
    }

    /*Test to move the element to the initial value*/
    @Test
    void testMoveToHead() {
        int value = -1;
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        solutionIterator.moveToHead();
        assertEquals(value, solutionIterator.getCurrentSolutionNumber());
    }

    /*Test to remove the element of solution list*/
    @Test
    void testRemove() {
        int value = 0;
        solutionList.add(solution);
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        solutionIterator.next();
        solutionIterator.remove();
        assertEquals(value, solutionIterator.solutionlist.size());
    }
}