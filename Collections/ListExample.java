package Collections;

import java.util.*;

/**
 * ListExample
 */
public class ListExample {

    public static void main(String[] args) {
        
        List<Student> listobj = LoadStudents();
        
        for (Student stud : listobj) {
            System.out.printf("Student ID: %d Name: %s Date of Birth: %s Department %d\n", stud.Id, stud.Name, stud.DateofBirth, stud.Department.Id);
        }
    }

    public static List<Student> LoadStudents()
    {
        var departments = LoadDepartments();
        var eeeDept = departments.get(0);
        var eceDept = departments.get(1);

        var students = new ArrayList<Student>();
        var stud1 = new Student() {{ 
            Id = 1; 
            Name = "Vidhya"; 
            DateofBirth = new Date(0, 10, 22);
            Department = eeeDept;
         }};

        students.add(stud1);

        var stud2 = new Student() {{ 
            Id = 2; 
            Name = "Arjun"; 
            DateofBirth = new Date(1987-11-20);
            Department = eceDept;
         }};

        students.add(stud2);
        return students;
    }

    public static List<Department> LoadDepartments()
    {
        List<Department> departments = new ArrayList<Department>();
        var dept1 = new Department();
        dept1.Id = 1001;
        dept1.Name = "EEE";
        dept1.HOD = "David";

        departments.add(dept1);

        var dept2 = new Department();
        dept2.Id = 2001;
        dept2.Name = "ECE";
        dept2.HOD = "Philip";

        departments.add(dept2);

        return departments;
    }
}

/**
 * InnerListExampleStude
 */
class Student {

    public int Id;
    public String Name;
    public Date DateofBirth;
    public Date DateofJoining;
    public Department Department;
}

class Department {

    public int Id;
    public String Name;
    public String HOD;
}