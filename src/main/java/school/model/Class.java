package school.model;

import java.util.List;

/**
 * All school classes are created with this blue print
 */
public class Class
{
    private String nameOfClass;
    List<Course> courses;

    public Class(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public Class(String nameOfClass, List<Course> courses)
    {
        this(nameOfClass); //using 'this' key word to chain first constructor to this constructor
        this.courses = courses;
    }

    public String getNameOfClass()
    {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass)
    {
        this.nameOfClass = nameOfClass;
    }

    public List<Course> getCourses()
    {
        return courses;
    }

    public void setCourses(List<Course> courses)
    {
        this.courses = courses;
    }

}
