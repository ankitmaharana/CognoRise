import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private static String[] words = {"java", "python", "computer", "hangman", "programming"};
    private static Random random = new Random();
    private static String wordToGuess;
    private static StringBuilder currentGuess;
    private static int maxTries = 6;
    private static int currentTry = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        wordToGuess = pickRandomWord();
        currentGuess = new StringBuilder(wordToGuess.length());
        for (int i = 0; i < wordToGuess.length(); i++) {
            currentGuess.append('_');
        }

        boolean gameWon = false;
        while (!gameWon && currentTry < maxTries) {
            displayHangman();
            System.out.println("Current Guess: " + currentGuess);
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);
            if (checkGuess(guess)) {
                System.out.println("Good guess!");
                if (currentGuess.indexOf("_") == -1) {
                    gameWon = true;
                }
            } else {
                System.out.println("Incorrect guess!");
                currentTry++;
            }
        }

        if (gameWon) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Sorry, you ran out of tries! The word was: " + wordToGuess);
        }
    }

    private static String pickRandomWord() {
        return words[random.nextInt(words.length)];
    }

    private static boolean checkGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                currentGuess.setCharAt(i, guess);
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    private static void displayHangman() {
        System.out.println("Number of tries left: " + (maxTries - currentTry));
        switch (currentTry) {
            case 0:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 1:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 2:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 3:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 4:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 5:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 6:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("=========");
                break;
        }
    }
}
