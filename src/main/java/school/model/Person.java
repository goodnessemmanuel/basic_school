package school.model;

import java.util.Calendar;

/**
 * This abstract class person creates a template that models real time people in the school.
 */

public abstract class Person
{
    //declaration of variables
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private int age;
    //regex to validate person's name
    private final String nameRegex = "[a-zA-Z]+";

    public Person(String firstName, String lastName, String gender, String dateOfBirth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        computeAge(dateOfBirth);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName.matches(nameRegex) ? firstName : this.firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.matches(nameRegex) ? lastName : this.lastName;
    }
    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        //regex to ensure that proper date format is entered
        String regexDateOfBirth = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
        this.dateOfBirth = dateOfBirth.matches(regexDateOfBirth) ? dateOfBirth : this.dateOfBirth;
        computeAge(this.dateOfBirth);
    }

    //method to compute person's age from date of given
    private void computeAge(String birthDate)
    {
        int birthYear;
        int currentYear;
        //if date of birth is still set to default, then no data was changed, hence set age to 0
        if (birthDate.equals("DD/MM/YYYY"))
        {
            age = - 1;
        }
        else
        {
            //date of birth is of the form "DD/MM/YYYY", split it  at "/" into an array
            String[] splitDateOfBirth = birthDate.trim().split("/");
            //cast each element of the array to an integer
            int day = Integer.parseInt(splitDateOfBirth[0]);
            int month = Integer.parseInt(splitDateOfBirth[1]);
            birthYear = Integer.parseInt(splitDateOfBirth[2]);

            //create an object of the calender and get the current year from it
            Calendar calendar = Calendar.getInstance();
            currentYear = calendar.get(Calendar.YEAR);

            //update person's age base on the below condition
            age = birthYear == 0 || day == 0 || month == 0 ? age : currentYear - birthYear;

        }
    }

    public int getAge()
    {
        return age;
    }
}
