import java.util.Scanner;  // Import the Scanner class

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       // Create a Scanner object to read input
        System.out.print("Enter your name: ");          // Prompt for user input
        String name = scanner.nextLine();               // Read a string input (name)

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();                     // Read an integer input (age)

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();             // Read a double input (height)

                                                          // Output the collected data
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");


    }}