package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;
    Assignment assignment;
    String courseName;

    /* This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    void testInit(){
        courseName = "SER515";
        course = new Course(courseName, 0);
        assignment = new Assignment();
    }

    /*Test for the course*/
    @Test
    public void testCourse() {
        assertEquals(courseName, course.toString());
        assertEquals(0, course.getCourseLevel());
    }
     /*Tests for adding assignment*/
    @Test
    public void testAddAssignment() {
        course.addAssignment(assignment);
        assertEquals(1, course.assignmentList.size());
    }

    /* Test to convert course object to string */
    @Test
    public void testToString() {
        assertEquals(courseName, course.toString());
    }

    /*Test if it accepts course*/
    @Test
    public void testAccept(){
        course.accept(new ReminderVisitor());
        assertTrue(course.isTrue());
    }
}