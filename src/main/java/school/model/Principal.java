package school.model;

import java.util.List;

/**
 * This Class models a School Principal and the privileges it can exercise,
 * A principal can be appointed from any of the  School staff.
 */
public class Principal extends Staff
{
    private List<Student> students;

    public Principal(Staff staff)
    {
        super(staff.getId(), staff.getFirstName(), staff.getLastName(), staff.getGender(), staff.getDateOfBirth());
        students = School.getStudents();
    }

    /**
     * This method has two signatures use to expel one or more student
     * @param studentToExpel can be expel by Principal
     */
    public List<Student> expelStudent(Student studentToExpel)
    {
       students.removeIf(student -> student.getId() == studentToExpel.getId());
       return students;
    }

    public List<Student> expelStudent(List<Student> studentsToExpel)
    {
        for (Student studentToExpel : studentsToExpel)
        {
            students.removeIf(student -> student.getId() == studentToExpel.getId());
        }
        return students;
    }

    /**
     * @param applicants is the list of applicants
     *  seeking admission into this School.
     *  Principal admits if applicant meets requirement
     */
    public List<Student> admitStudents(List<Applicant> applicants)
    {
        int maxAge = 18;
        int minAge = 8;
        if(applicants != null)
        {
            for (Applicant applicant: applicants) {
                //ensure applicant meets admission requirement
                if(applicant.getAge() >= minAge && applicant.getAge() <= maxAge)
                {
                    Student student =
                            new Student(applicant.getId(), applicant.getFirstName(), applicant.getLastName(),
                                 applicant.getDateOfBirth(), applicant.getGender(), applicant.getApplicantClass()
                    );
                    students.add(student);
                }
            }
        }
        return students;
    }

}
