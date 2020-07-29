package school.model;
import java.util.List;

public class Teacher extends Staff implements StaffType{
    //declaration of variables that composes a teacher
    private Course course;
    private Class singleClass;
    //classes that a teacher handles
    private List<Class> classes;

    public Teacher(int id, String firstName, String lastName, String gender, String dateOfBirth)
    {
        super(id, firstName, lastName, gender, dateOfBirth);
    }

    /**
     * @param classes assigns multiple classes to a teacher
     */
    public void assignClasses(List<Class> classes)
    {
        this.classes = classes;
    }

    /**
     * @param singleClass assigns single class to a teacher
     */
    public void assignClasses(Class singleClass)
    {
        this.singleClass = singleClass;
    }

    public List<Class> getAssignedClasses()
    {
        return this.classes;
    }

    public Class getAssignedClass()
    {
        return this.singleClass;
    }

    public void assignCourse(Course course)
    {
        this.course = course;
    }

    public Course getAssignedCourse()
    {
        return this.course;
    }

    /**
     * @return 2 to differentiate teachers from other staff
     */
    @Override
    public int type() {
        return 1;
    }
}
