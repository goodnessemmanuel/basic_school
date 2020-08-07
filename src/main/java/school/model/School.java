package school.model;

import java.util.ArrayList;
import java.util.List;

/**
 * School model
 */

public class School
{

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
    public void addStaff(Staff newStaff)
    {
        if(!staffIdExist(newStaff))
        {
            staffs.add(newStaff);
        }
    }
    //check identity staff id
    public boolean staffIdExist(Staff newStaff)
    {
        for (Staff staff: staffs)
        {
            if(staff.getId() == newStaff.getId())
            {
                return true;
            }
        }
        return false;
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

    public List<Student> admitNewStudents(List<Applicant> applicants)
    {
        if(applicants != null && principal != null)
        {
           students = principal.admitStudents(applicants);
        }
        return students;
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
