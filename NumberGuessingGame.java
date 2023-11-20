import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int maxAttempts = 3;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number correctly.");
                score += (maxAttempts - attempt + 1); // Award points based on remaining attempts
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }

            if (attempt < maxAttempts) {
                System.out.println("You have " + (maxAttempts - attempt) + " attempts left.");
            } else {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }
        }

        System.out.println("Your score: " + score);
        System.out.println("Thanks for playing!");
    }
}
