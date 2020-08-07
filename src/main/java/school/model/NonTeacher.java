package school.model;

/**
 * non-academic staffs
 */

public class NonTeacher extends Staff {

    public NonTeacher(int id, String firstName, String lastName, String gender, String dateOfBirth)
    {
        super(id, firstName, lastName, gender, dateOfBirth);
    }

    /**
     * @return 2 to differentiate non-teachers from other staff
     */
    @Override
    public int type() {
        return 2;
    }
}
