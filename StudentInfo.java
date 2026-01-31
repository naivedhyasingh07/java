public class StudentInfo {
    
    // static variable (common for all students)
    static String collegeName = "Symbiosis Institute of Technology";

    // instance variables
    String name;
    long prn;
    int rollNo;

    // parameterized constructor
    StudentInfo(String n, long p, int r) {
        name = n;
        prn = p;
        rollNo = r;
    }

    // method to display details
    void display() {
        System.out.println("College Name : " + collegeName);
        System.out.println("Name         : " + name);
        System.out.println("PRN          : " + prn);
        System.out.println("Roll No      : " + rollNo);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo("Naivedhya", 1234567890L, 45);
        StudentInfo s2 = new StudentInfo("Aarav", 1234567891L, 46);

        s1.display();
        s2.display();
    }
}


