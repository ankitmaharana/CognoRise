import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;   // Lower bound of the number to guess
        int upperBound = 100; // Upper bound of the number to guess
        int maxAttempts = 10; // Maximum number of attempts allowed
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        
        while (attempts < maxAttempts && !guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == numberToGuess) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        if (!guessedCorrectly) {
            System.out.println("Sorry, you ran out of attempts! The number was: " + numberToGuess);
        }
        
        scanner.close();
    }
}
