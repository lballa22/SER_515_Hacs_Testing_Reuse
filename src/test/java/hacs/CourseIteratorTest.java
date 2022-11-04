package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseIteratorTest {
    CourseIterator courseIterator = new CourseIterator();
    ClassCourseList classCourseList = new ClassCourseList();
    /* This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    void testInit(){
        courseIterator = new CourseIterator();
        classCourseList = new ClassCourseList();
    }

    /*Tests if courseiterator has next course*/
    @Test
    void testHasNext() {
        Course course = new Course("SER515", 1);
        classCourseList.add(course);
        CourseIterator courseIterator = new CourseIterator(classCourseList);
        assertTrue(courseIterator.hasNext());
    }

    /*Test if there is next course for true condition*/
    @Test
    void testNext() {
        Course course = new Course("SER515", 1);
        classCourseList.add(course);
        CourseIterator courseIterator = new CourseIterator(classCourseList);
        assertNotNull(courseIterator.next());
    }

    /*Test if there is next course for false condition*/
    @Test
    void testNextNull() {
        ClassCourseList classCourseList = new ClassCourseList();
        CourseIterator courseIterator = new CourseIterator(classCourseList);
        assertNull(courseIterator.next());
    }

    /*Tests to remove course iterator of a course*/
    @Test
    void testRemove() {
        int val = 0;
        Course course = new Course("SER515", 1);
        classCourseList.add(course);
        CourseIterator courseIterator = new CourseIterator(classCourseList);
        courseIterator.next();
        courseIterator.remove();
        assertEquals(val, courseIterator.getTheCourseList().size());
    }
}
