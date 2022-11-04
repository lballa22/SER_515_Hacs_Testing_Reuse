package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    /*This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    void testInit(){
        student = new Student();
    }

    /*Test to create low level create course*/
    @Test
    public void testCreateCourseMenuLowLevel() {
        Course course = new Course("SER515", 0);
        CourseMenu courseMenu = student.createCourseMenu(course, 0);
    }

    /*Test to create high level create course*/
    @Test
    public void testCreateCourseMenuHighLevel() {
        Course course = new Course("SER515", 0);
        CourseMenu courseMenu = student.createCourseMenu(course, 1);
    }

    /* test to add new course to the student*/
    @Test
    public void testAddCourse() {
        Course course = new Course("SER515", 0);
        student.addCourse(course);
        assertEquals(course, student.courseList.get(0));
    }

    /* Test to get all the courses list of a student after adding one course */
    @Test
    public void testGetCourseList() {
        Course course = new Course("SER515", 0);
        student.addCourse(course);
        assertEquals(course, student.getCourseList().get(0));
    }
}