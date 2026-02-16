import java.util.ArrayList;
import java.util.List;

// Renamed Student class
class StudentRecord {

    private String name;
    private List<Double> grades;

    // Constructor
    public StudentRecord(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Add grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Calculate average
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    // Display details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
        System.out.println("--------------------------");
    }

    public String getName() {
        return name;
    }
}


// GradeManager class
class GradeManager {

    private List<StudentRecord> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(StudentRecord student) {
        students.add(student);
    }

    public StudentRecord findStudentByName(String name) {
        for (StudentRecord student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (StudentRecord student : students) {
                student.displayStudentDetails();
            }
        }
    }
}


// Main Class
public class StudentApp {

    public static void main(String[] args) {

        GradeManager manager = new GradeManager();

        StudentRecord s1 = new StudentRecord("Rahul");
        StudentRecord s2 = new StudentRecord("Priya");

        manager.addStudent(s1);
        manager.addStudent(s2);

        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(78);

        s2.addGrade(88);
        s2.addGrade(92);
        s2.addGrade(81);

        System.out.println("---- All Students ----");
        manager.displayAllStudents();

        System.out.println("---- Search Student ----");
        StudentRecord found = manager.findStudentByName("Rahul");

        if (found != null) {
            found.displayStudentDetails();
        } else {
            System.out.println("Student not found.");
        }
    }
}
