package school.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest
{
    private Person person;

    //Person class should reference child class
    public void applicantTest(Applicant applicant) {
        person = applicant;
    }

    @BeforeEach
    void init()
    {
        person = new Applicant();
    }

    //group all name related test together in this nested class for clarity
    @Nested
    @DisplayName("Should add person's name")
    class testName
    {
        @DisplayName("Checking first name")
        @Test
        void shouldValidateFirstName()
        {
            String expected1 = "default";
            person.setFirstName("james"); //should not allow empty strings
            String actual1 = person.getFirstName();
            String expected2 = "ju45de";
            person.setFirstName("jude"); //names cannot contain number/s
            String actual2 = person.getFirstName();
            if (expected1.equals(actual1) || !expected2.equals(actual2)) {
                fail("the first name field is empty or first name contains numbers");
            }
        }

        @DisplayName("Checking last name")
        @Test
        void shouldValidateLastName()
        {
            String expected1 = "default";
            person.setLastName("James"); //should not allow empty string
            String actual1 = person.getLastName();
            String expected2 = "winner";
            person.setLastName("winner");
            String actual2 = person.getLastName();
            assertAll(
                    () -> assertNotEquals(expected1, actual1, "last name should not be empty or default"),
                    () -> assertEquals(expected2, actual2, "last name should be correct when set")

            );
        }
    }
    //group all date of birth and age computation test in this nested class
    @DisplayName("Should add/update date of birth")
    @Nested
    class testBirthDateAndAge
    {
        @DisplayName("Checking birth date")
        @Test
        void testShouldValidateDateOfBirth()
        {
            //default date of birth is "DD/MM/YYYY", if it is not updated or
            //it was updated in a wrong format (e.g. "10/12/20A0";), report false.
            String dateOfBirth = "DD/MM/YYYY";
            person.setDateOfBirth("10/11/2000");
            String defaultOrContainsLetter = person.getDateOfBirth();
            boolean birthDateInvalidOrIsDefault = dateOfBirth.equals(defaultOrContainsLetter);
            assertFalse(birthDateInvalidOrIsDefault, "Should add a valid date of birth: " + person.getDateOfBirth());

        }

        @DisplayName("Should compute age from date of birth")
        @Test
        void testComputeAge()
        {
            person.setDateOfBirth("10/10/1990");
            int actualAge1 = person.getAge();
            boolean negativeAge = actualAge1 < 0; //user enters a future date of birth
            assertFalse(negativeAge, "Incorrect date of birth " + person.getDateOfBirth());
        }

    }
}