public class Array {

    // Method defined outside of main to return the first element of the array
    public static int constantTimeExample(int... arr) {
        return arr[2]; // Return the first element of the array
    }

    public static void main(String[] args) {
        // You can now pass individual integers directly
        System.out.println(constantTimeExample(10, 20, 30, 40));




}  }
