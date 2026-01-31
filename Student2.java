public class Student2 {

    String name;
    long prn;
    int rollNo;

    // Parameterized constructor
    Student2(String n, long p, int r) {
        name = n;
        prn = p;
        rollNo = r;

        // Printing inside constructor
        System.out.println("Name    : " + name);
        System.out.println("PRN     : " + prn);
        System.out.println("Roll No : " + rollNo);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("Naivedhya", 1234567890L, 45);
    }
}
