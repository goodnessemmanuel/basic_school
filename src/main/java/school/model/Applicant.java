package school.model;
/**
 * This Applicant class creates a template that models real time applicants of this school.
 * each applicants will have a unique data based on this blue print.
 */
public class Applicant extends Person
{
    //declaration of member variables
    private int id;
    private String address;
    private String phoneNumber;
    private Class applicantClass;

    //constructor to initialize each object of this class to default for all applicants at

    /**
     * If applicant's empty constructor is called for the first time it initialize all
     * field to default. user can now call the set method to fill applicant's details
     */
    public Applicant()
    {
        this(0, "default", "default", "default", "DD/MM/YYYY",
                "default", "000-000-00000", null); //constructor chaining to reuse code

    }

    //this private constructor is use to set applicant's default value when call to the empty constructor is made
    Applicant(int id, String firstName, String lastName, String gender, String dateOfBirth,
              String address, String phoneNumber, Class applicantClass)
    {
        super(firstName, lastName, gender, dateOfBirth);
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.applicantClass = applicantClass;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }


    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * @param phoneNumber should starts at zero with a total of 11 digits
     */

    public void setPhoneNumber(String phoneNumber)
    {
        String phoneRegex = "^[0][1-9]\\d{9}$"; //regex to validate phone number
        this.phoneNumber = phoneNumber.matches(phoneRegex) ? phoneNumber : this.phoneNumber;
    }

    public Class getApplicantClass() {
        return applicantClass;
    }

    public void setApplicantClass(Class applicantClass) {
        this.applicantClass = applicantClass;
    }
}
