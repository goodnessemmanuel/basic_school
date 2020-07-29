package school.model;

import java.util.ArrayList;
import java.util.List;

/**
 * School Model by Ejeh Oche Emmanuel.
 */
public class MainApp {
    public static void main(String[] args) {
        //create a school
        School school = new School("St. Thomas Academy");

        //adding both teaching and non-teaching staffs to school
        school.addStaff(new Teacher(1, "Monday", "John", "Male", "10/10/1990"));
        school.addStaff(new Teacher(2, "Johnson", "Vee", "Male", "7/11/1993"));
        school.addStaff(new Teacher(3, "Maria", "Kins", "Female", "7/01/1989"));
        school.addStaff(new Teacher(4, "Kate", "Jims", "Female", "13/01/1991"));
        school.addStaff(new NonTeacher(5, "Monday", "John", "Male", "10/10/1990"));
        school.addStaff(new NonTeacher(6, "Johnson", "Vee", "Male", "7/11/1993"));

        //retrieve a staff from school by providing id of such staff
        Staff callStaff = school.getStaff(2); // say the target staff id is 2, for instance.

        //print detail to confirm
        System.out.println(callStaff.getFirstName() + ", " + callStaff.getLastName());

        //Appoint principal by calling appointprincipal() method which takes a staff
        school.appointPrincipal(callStaff);

        //call the appointed principal of the school
        Principal principal = school.getPrincipal();

        //to add students you have to create a list of applicants seeking admission to the school
        List<Applicant> applicants = new ArrayList<>();

        applicants.add(new Applicant(1, "John", "Emmanuel", "Male", "7/7/2012",
                "10 gibson way", "07067418830", new Class("Jss1")));

        applicants.add(new Applicant(2, "Jane", "Gibson", "Female", "7/7/2010",
                "10 gibson way", "07067418830", new Class("Jss1")));

        //call the admit new students of school and pass the applicants
        school.admitNewStudents(applicants);

        //if principal admits the student you can now call the using getStudents method
        List<Student> students = School.getStudents();

        //loop through to check if applicants were all accepted
        for (Student student : students)
        {
            System.out.printf("%d %s %s %s %s %s%n", student.getId(), student.getFirstName(), student.getLastName(),
            student.getDateOfBirth(), student.getGender(), student.getStudentClass());
        }

    }
}
