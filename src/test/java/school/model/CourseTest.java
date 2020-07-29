package school.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * course test class used to test expected output of the Course class before actual development
 */

@DisplayName("should add Course and update course") //display this name as test title during run time
class CourseTest {
    private Course course;

    //use the Before each annotation of the junit life circle to create
    // an object of Course class during initialization of each test
    @BeforeEach
    void init()
    {
        course = new Course();
    }

    //testing setter and getter method of course id
    @DisplayName("Checking Course id")
    @Test
    void testCourseId()
    {
        //check for this multiple test cases
        int expected1 = 0;
        int actual1 = course.getId(); //test should output default value

        //point course object to a new instance of Course and check if the new values are updated
        int expected2 = 1;
        course = new Course(1, "Mathmatics", "Basic mathematics");
        int actual2 = course.getId();

        //update the id of new object using setId() to a different value, check if it updates
        int expected3 = 3;
        course.setId(3);
        int actual3 = course.getId();
        //assertAll implementation on multiple test cases with lambda
        assertAll(
                () -> assertEquals(expected1, actual1, "course id is default and has not been set"),
                () -> assertEquals(expected2, actual2, "course id updated via new object of Course"),
                () -> assertEquals(expected3, actual3, "course id updated via setId() of class Course")
        );
    }

    //testing setter and getter method of course title
    @DisplayName("Checking Course title")
    @Test
    void testCourseTitle()
    {
        //multiple test cases to test
        String expected1 = "default";
        String actual1 = course.getTitle(); //test should output default value

        //point course object to a new instance of Course and check if the new values are updated
        String expected2 = "Chemistry";
        course = new Course(1, "Chemistry", "Chemistry Introduction");
        String actual2 = course.getTitle();

        //update the id of new object using setId() to a different value, check if it updates
        String expected3 = "Physics";
        course.setTitle("Physics");
        String actual3 = course.getTitle();
        //assertAll implementation on multiple test cases with lambda
        assertAll(
                () -> assertEquals(expected1, actual1, "course title is default and has not been set"),
                () -> assertEquals(expected2, actual2, "course title updated via new object of Course"),
                () -> assertEquals(expected3, actual3, "course title updated via setTitle() of class Course")
        );
    }

    //testing setter and getter method of course title
    @DisplayName("Checking Course description")
    @Test
    void testCourseDescription()
    {
        //check for this multiple test cases
        String expected1 = "default";
        String actual1 = course.getDescription(); //test should output default value

        //point course object to a new instance of Course and check if the new values are updated
        String expected2 = "Chemistry";
        course = new Course(1, "Chemistry", "Chemistry Introduction");
        String actual2 = course.getTitle();

        //update the id of new object using setId() to a different value, check if it updates
        String expected3 = "Fundamentals of Chemistry";
        course.setTitle("Fundamentals of Chemistry");
        String actual3 = course.getTitle();
        //assertAll implementation on multiple test cases with lambda
        assertAll(
                () -> assertEquals(expected1, actual1, "course description is default and has not been set"),
                () -> assertEquals(expected2, actual2, "course description updated via new object of Course"),
                () -> assertEquals(expected3, actual3, "course description updated via setDescription() of class Course")
        );
    }

    //test the overridden toString() of the Class course
    @DisplayName("Checking Course toString() method")
    @Test
    void testCoursetoString()
    {
        //check for this multiple test cases
        String expected1 = "Course{id: 0, title: 'default', description: 'default'}";
        String actual1 = course.toString(); //test should output default value

        //point course object to a new instance of Course and check if the new values are updated in the String return
        String expected2 = "Course{id: 1, title: 'Chemistry', description: 'Chemistry Introduction'}";
        course = new Course(1, "Chemistry", "Chemistry Introduction");
        String actual2 = course.toString();

        //assertAll implementation on multiple test cases with lambda
        assertAll(
                () -> assertEquals(expected1, actual1, "calling course object toString() method with default value"),
                () -> assertEquals(expected2, actual2, "calling course object toString() method with updated value")
        );
    }
}