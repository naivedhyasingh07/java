class OverloadExample {

    // Method with two int parameters
    void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    // Method with two double parameters
    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    // Method with three int parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.add(10, 20);          // calls add(int, int)
        obj.add(10.5, 20.5);      // calls add(double, double)
        obj.add(5, 10, 15);       // calls add(int, int, int)
    }
}
