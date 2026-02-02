class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;      // current class variable
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
    }
}

public class MainThis {
    public static void main(String[] args) {
        Student s1 = new Student("Naivedhya", 21);
        s1.display();
    }
}
