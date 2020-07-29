package school.model;

import java.util.ArrayList;
import java.util.List;

public class School
{
    /**
     * School model
     */
    private String name;
    private static List<Staff> staffs;
    private static List<Student> students;
    private Principal principal;

    //initialize all member variables when constructor is called
    public School(String name)
    {
        this.name = name;
        students = new ArrayList<>();
        staffs = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static List<Staff> getStaffs()
    {
        return staffs;
    }

    public void addStaff(Staff staff)
    {
        staffs.add(staff);
    }

    public static List<Student> getStudents()
    {
        return students;
    }

    public boolean admitNewStudents(List<Applicant> applicants)
    {
        if(applicants != null && principal != null)
        {
            principal.admitStudents(applicants);
            return true;
        }
        return false;
    }

    public Principal getPrincipal(Staff staff)
    {
        return principal;
    }

    public void appointPrincipal(Staff staff)
    {
        this.principal = new Principal(staff);
    }

}
