class College {
    String collegeName = "Symbiosis Institute";

    College() {
        System.out.println("Parent constructor called");
    }

    void showCollege() {
        System.out.println("College Name: " + collegeName);
    }
}

class StudentCollege extends College {
    String name;

    // ✅ DEFAULT CONSTRUCTOR — MUST EXIST
    StudentCollege() {
        super();              // calls College constructor
        name = "Naivedhya";
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Parent College: " + super.collegeName);
        super.showCollege();
    }
}

public class MainSuper {
    public static void main(String[] args) {
        StudentCollege s = new StudentCollege();   // ✅ matches constructor
        s.display();
    }
}
