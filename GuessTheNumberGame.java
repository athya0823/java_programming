import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've chosen a number between " + lowerBound + " and " + upperBound + ".");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
