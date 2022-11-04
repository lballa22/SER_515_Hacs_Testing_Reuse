package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassCourseListTest {

    ClassCourseList c;
    /* This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    public void testInit(){
        c = new ClassCourseList();
    }

    /*Test to find course by name*/
    @Test
    public void testFindCourseByName() {
        String fileName = "CourseInfo.txt";
        c.initializeFromFile(fileName);
        assertEquals("SER515", c.findCourseByCourseName("SER515").toString());
    }

    /*Test to find course by name of null value*/
    @Test
    public void testFindCourseByNameNull() {
        String fileName = "CourseInfo.txt";
        c.initializeFromFile(fileName);
        assertEquals(null, c.findCourseByCourseName("SER514"));
    }

    /*Test if its initializes from file */
    @Test
    void testInitializeFromFile() {
        c.initializeFromFile("CourseInfo.txt");
        assertEquals(3, c.size());
    }
}
