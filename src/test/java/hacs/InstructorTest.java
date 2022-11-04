package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    Instructor instructor;
    String courseName;

    /* This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    void testInit()
    {
        courseName = "SER515";
       instructor = new Instructor();
    }

    /*Test for creating course menu*/
    @Test
    void testCreateCourseMenu() {
        CourseMenu courseMenu = instructor.createCourseMenu(new Course(courseName, 0), 0);
        assertTrue(courseMenu instanceof HighLevelCourseMenu);
    }

    /*Test for checking instructor type*/
    @Test
    void testInstructor() {
        int value = 1;
        assertEquals(value, instructor.type);
    }

    /*Test to check high level course menu creation*/
    @Test
    public void testHighLevelCreateCourseMenu() {
        Course course = new Course(courseName, 0);
        CourseMenu courseMenu = instructor.createCourseMenu(course, 0);
        assertEquals(courseMenu.getClass(), HighLevelCourseMenu.class);
    }

    /* Test to check low level course menu creation*/
    @Test
    public void testLowLevelCreateCourseMenu() {
        Course course = new Course(courseName, 0);
        CourseMenu courseMenu = instructor.createCourseMenu(course, 1);
        assertEquals(courseMenu.getClass(), LowLevelCourseMenu.class);
    }

    /* Test to check is course getting added to the instructor */
    @Test
    public void testAddCourse() {
        Course course = new Course(courseName, 0);
        instructor.addCourse(course);
        assertEquals(course, instructor.courseList.get(0));
    }

    /* Test to get the list of courses of an instructor */
    @Test
    public void testGetCourseList() {
        Course course = new Course(courseName, 0);
        instructor.addCourse(course);
        assertEquals(course, instructor.getCourseList().get(0));
    }

}