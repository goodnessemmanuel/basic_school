package school.model;

import java.util.List;

public class Student extends Person{
    private int id;
    private Class studentClass;

    public Student(int id, String firstName, String lastName, String dateOfBirth, String gender, Class studentClass)
    {
        super(firstName, lastName, gender, dateOfBirth);
        this.id = id;
        this.studentClass = studentClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Class getStudentClass() {
        return studentClass;
    }

    public String getClassName()
    {
        return studentClass.getNameOfClass();
    }

    public void setStudentClass(Class studentClass)
    {
        this.studentClass = studentClass;
    }

}
