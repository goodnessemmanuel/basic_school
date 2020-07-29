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

    public Staff getStaff(int staffId)
    {
        Staff targetStaff = null;
        for (Staff staff : staffs)
        {
            if (staffId == staff.getId())
            {
                targetStaff = staff;
            }
        }
        return targetStaff;
    }

    //adding one staff
    public void addStaff(Staff staff)
    {
        staffs.add(staff);
    }
    //adding more than one staff
    public void addStaff(List<Staff> staffsToAdd)
    {
        staffs.addAll(staffsToAdd);
    }

    public static List<Student> getStudents()
    {
        return students;
    }

    public void admitNewStudents(List<Applicant> applicants)
    {
        System.out.println("I was here");
        if(applicants != null && principal != null)
        {
           students = principal.admitStudents(applicants);
        }
    }
    public Principal getPrincipal()
    {
        return principal;
    }

    public void appointPrincipal(Staff staff)
    {
        this.principal = new Principal(staff);
    }

}
