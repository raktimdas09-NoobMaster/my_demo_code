import java.util.Scanner;
import java.util.Random;

public class ArrayIntToString {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Loop to keep the game running until the user decides to stop
        while (true) {
            System.out.println("Enter a number (0, 1, 2) for Rock, Paper, or Scissors (or any other number to exit):");

            // Get user input
            int value = sc.nextInt();


            // Exit condition if the input is not 0, 1, or 2
            if (value < 0 || value > 2) {
                System.out.println("Exiting the program...");
                break; // Exit the loop and the program
            }

            // Get the choice from the array based on the user input
            String choice = choices[value];
            System.out.println("You chose: " + choice);
        }

        sc.close();  // Close the scanner to avoid resource leak
    }
}
