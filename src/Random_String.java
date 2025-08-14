import java.util.Random;

public class Random_String {

    public static void main(String[] args) {
        Random random = new Random();

        // Array of possible choices
        String[] choices = {"Rock", "Paper", "Scissors", "Mobile", "Notepad"};

        // Generate a random index between 0 and 4 (for 5 items in the array)
        int computerChoiceIndex = random.nextInt(5);

        // Get the corresponding choice from the array
        String computerChoice = choices[computerChoiceIndex];

        // Output the computer's random choice
        System.out.println(computerChoice);
    }
}
