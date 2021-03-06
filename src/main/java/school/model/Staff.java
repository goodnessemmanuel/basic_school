package school.model;

public abstract class Staff extends Person
{
    private int id;
    private StaffLevel staffLevel;

    public Staff(int id, String firstName, String lastName, String gender, String dateOfBirth)
    {
        super(firstName, lastName, gender, dateOfBirth);
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public StaffLevel getStaffLevel()
    {
        return staffLevel;
    }

    public void setStaffLevel(StaffLevel staffLevel)
    {
        this.staffLevel = staffLevel; //rank staff
    }

    public abstract int type(); //handles the type of staff
}
