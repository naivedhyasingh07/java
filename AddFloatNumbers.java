public class AddFloatNumbers {

    // Function to add two float numbers
    static float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {

        float x = 10.5f;
        float y = 5.5f;

        // Calling function from main
        float result = add(x, y);

        System.out.println("Addition = " + result);
    }
}


