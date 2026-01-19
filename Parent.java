public class Parent {

    int number = 50;

    void show() {
        System.out.println("This is Parent class method");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

// Child class
class Child extends Parent {

    void display() {
        // Accessing parent class properties
        System.out.println("Number = " + number);
        show();
    }
}
