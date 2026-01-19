class Student {
    String name;
    int age;

    Student(){
        name = "Default Name";
        age = 18;

    }
    void display(){
        System.out.println("Name: "+name +",Age :" +age);
    }

}
public class Main{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}
