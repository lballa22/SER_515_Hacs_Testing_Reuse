package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    /*This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    void testInit(){
        solution = new Solution();
    }

    /*Test to convert string of solution*/
    @Test
    void testToString() {
        solution.setTheAuthor("Loka Kalyan");
        solution.setSolutionFileName("Solution");
        solution.grade = 0;
        solution.reported = false;
        assertEquals("Loka Kalyan"+" Solution Grade ="+" 0 not reported.", solution.toString());
    }

    /*Test to get grade string*/
    @Test
    void testGetGradeString() {
        String value = "-1";
        assertEquals(value, solution.getGradeString());
    }

    /*Test to get integer grade*/
    @Test
    void testGetGradeInt() {
        int value = 0;
        assertEquals(value, solution.getGradeInt());
    }

    /*Test to check if integer grade has been reported*/
    @Test
    public void testGetGradeIntReported() {
        solution.author = "Loka";
        solution.solutionFileName = "Solution";
        solution.grade = 5;
        solution.reported = true;
        assertEquals("5", solution.getGradeString());
    }

    /*Test to check if integer grade is not reported*/
    @Test
    public void testGetGradeIntReportedFalse() {
        solution.author = "Loka";
        solution.solutionFileName = "Solution";
        solution.grade = 5;
        solution.reported = false;
        assertEquals("-1", solution.getGradeString());
    }

    /*Test to check if set reported its false*/
    @Test
    void testSetReported() {
        solution.setReported(true);
        assertTrue(solution.isReported());
    }

    /*Test to check if solution is set reported*/
    @Test
    void testIsReported() {
        solution.author = "Loka";
        solution.solutionFileName = "Solution";
        solution.setReported(false);
        assertEquals(false, solution.isReported());
    }

}