package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;


class AssignmentTest {

    Assignment assignment;
    Solution solution;
    /* This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    public void testInit(){
        assignment = new Assignment();
        solution = new Solution();
    }

    /*tests the set due date whether it has been set or not*/
    @Test
    public void testSetDueDate() {
        Date date = new Date(2022 - 11 - 03);
        assignment.setDueDate(date);
        assertEquals(date, assignment.dueDate);
    }

    /* Test assignment Specification */
    @Test
    public void testSetAssignmentSpecification() {
        String param = "Testing";
        assignment.setAssignmentSpecification(param);
        assertEquals(param, assignment.assignmentSpecification);
    }

    /* Tests condition if overdue is true */
    @Test
    public void testOverDueTrue() {
        Date date = new Date(2022 - 11 - 03);
        assignment.setDueDate(date);
        assertTrue(assignment.isOverDue());
    }

    /* Test overdue condition for false */
    @Test
    public void testOverDueFalse() {
        assignment.setDueDate(new Date());
        assertFalse(assignment.isOverDue());
    }

    /* Test to add solution  */
    @Test
    public void testAddSolution() {
        Solution solution = assignment.addSolution();
        assertNotNull(solution);
    }

    /* Test to add solution with parameter */
    @Test
    public void testAddSolutionParam() {
        Solution sol = assignment.addSolution();
        assignment.addSolution(sol);
        Solution testSolution = assignment.theSolutionList.get(0);
        assertEquals(sol, testSolution);
    }


    /* Testing to convert to string */
    @Test
    public String testToString() {
        String param = "Testing";
        assignment.assignmentName = param;
        assertEquals(param, assignment.toString());
        return null;
    }

    /*Test to get solution iterator*/
    @Test
    void testGetSolutionIterator() {
        SolutionIterator solutionIterator = assignment.getSolutionIterator();
        assertEquals(0, solutionIterator.solutionlist.size());
    }

    /*Test to get due date of assignment*/
    @Test
    void testGetDueDateString() {
        Date date = new Date();
        assignment.setDueDate(date);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        assertEquals(dateFormat.format(date), assignment.getDueDateString());
    }

    /*Test to accept assignment*/
    @Test
    void testAccept() {
        assignment.accept(new ReminderVisitor());
        assertTrue(assignment.isTrue());
    }

}
