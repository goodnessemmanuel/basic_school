package school.model;

/**
 * This class responsible for creation of applicants
 */

public class Applicant extends Person
{
    //declaration of member variables
    private int id;
    private String address;
    private String phoneNumber;
    private Class applicantClass;

    //initialize applicants with default information
    public Applicant()
    {
        this(0, "default", "default", "default", "DD/MM/YYYY",
                "default", "000-000-00000", null);

    }

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
        String phoneRegex = "^[0][1-9]\\d{9}$"; //validate phone number
        this.phoneNumber = phoneNumber.matches(phoneRegex) ? phoneNumber : this.phoneNumber;
    }

    public Class getApplicantClass() {
        return applicantClass;
    }

    public void setApplicantClass(Class applicantClass) {
        this.applicantClass = applicantClass;
    }
}
