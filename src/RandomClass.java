import java.util.Random;


public class RandomClass {
    public static void main(String[] args) {


        Random random = new Random();    //Create a Random object to read input

        int r = random.nextInt(3);  // Generates a random integer between 0 (inclusive) and 3 (exclusive)
        System.out.println(r);
    }
}





