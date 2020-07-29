package school.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * This ApplicantTest class predetermined by way of assertion, what is expected of the Applicant class
 */

@DisplayName("Test Applicant") //label to describe which test case is currently running
class ApplicantTest extends PersonTest {
    private Applicant applicant;

    //use this annotation before each test begins to instantiate the Applicant class
    @BeforeEach
    void init()
    {
        applicant = new Applicant();
        applicantTest(applicant);
    }

    @DisplayName("Should add and validate phone number")
    @Test
    void testPhoneNumber()
    {
        //multiple tests with phone number entry
        String expected = "000-000-00000";
        String actual1 = applicant.getPhoneNumber();
        applicant.setPhoneNumber("908889298");
        String actual2 = applicant.getPhoneNumber();
        String expected3 = "09067546672";
        applicant.setPhoneNumber("09067546672");
        String actual3 = applicant.getPhoneNumber();
        assertAll(
                () -> assertEquals(expected, actual1, "When phone number is not set"),
                () -> assertEquals(expected, actual2, "When phone number digits is not up to 11"),
                () -> assertEquals(expected3, actual3, "When phone number digits is correct")
        );
    }

}