public class StudentRecord {

    // static variable (common for all students)
    static String collegeName = "Symbiosis Institute of Technology";

    // instance variables
    String name;
    long prn;
    int rollNo;

    // parameterized constructor
    StudentRecord(String n, long p, int r) {
        name = n;
        prn = p;
        rollNo = r;
    }

    // instance method
    void showStudent() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Name         : " + name);
        System.out.println("PRN          : " + prn);
        System.out.println("Roll No      : " + rollNo);
    }

    // static method
    static void displayDetails() {
        // creating object to access instance method
        StudentRecord s = new StudentRecord("Naivedhya", 1234567890L, 45);
        s.showStudent();
    }

    public static void main(String[] args) {
        // calling static method
        displayDetails();
    }
}


