package hacs;

/**
 * @author Loka Kalyan Balla
 * @version 1.0
 * @course SER515
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {
    Facade facade = new Facade();
    ClassCourseList classCourseList = new ClassCourseList();

    /* This method runs before each test case runs and creates needed objects for test case*/
    @BeforeEach
    void testInit(){
        facade = new Facade();
        classCourseList = new ClassCourseList();
    }

    /*Tests to submit solution*/
    @Test
    void testsubmitSolution() {
        int value = 1;
        Assignment assignment = new Assignment();
        Solution solution = new Solution();
        facade.submitSolution(assignment, solution);
        assertEquals(value, assignment.getTheSolutionList().size());
    }

    /*Tests for creating user*/
    @Test
    void testCreateUser() {
        UserInfoItem userInfoItem = new UserInfoItem();
        userInfoItem.userType = UserInfoItem.UserType.STUDENT;
        facade.createUser(userInfoItem);
        assertTrue(facade.thePerson instanceof Student);
    }

    /*Tests for creating course List*/
    @Test
    void testCreateCourseList() {
        int value = 3;
        facade.createCourseList();
        assertEquals(value, facade.theCourseList.size());
    }

    /*Tests for attaching course to user type*/
    @Test
    void testAttachCourseToUser() {
        int value = 2;
        UserInfoItem userInfoItem = new UserInfoItem();
        userInfoItem.userType = UserInfoItem.UserType.STUDENT;
        userInfoItem.strUserName = "mimi";
        facade.createUser(userInfoItem);
        facade.createCourseList();
        facade.attachCourseToUser();
        assertEquals(value, facade.thePerson.getCourseList().size());
    }
}