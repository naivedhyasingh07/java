public class Calculator2 {

    int a, b;

    // Parameterized constructor
    Calculator2(int x, int y) {
        a = x;
        b = y;

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));

        // Division with check
        if (b != 0) {
            System.out.println("Division       : " + (a / b));
        } else {
            System.out.println("Division       : Not possible (divide by zero)");
        }
    }

    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2(20, 10);
    }
}


