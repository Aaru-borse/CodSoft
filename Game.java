package Aarti;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int attempts = 10; // Number of attempts allowed
        int score = 0; // Number of rounds won
        
        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;
        
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int currentAttempt = 0;
            
            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + attempts + " attempts to guess it.");
            
            while (currentAttempt < attempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                
                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Please guess within the specified range.");
                    continue;
                }
                
                currentAttempt++;
                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + currentAttempt + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low. Attempts left: " + (attempts - currentAttempt));
                } else {
                    System.out.println("Your guess is too high. Attempts left: " + (attempts - currentAttempt));
                }
            }
            
            if (currentAttempt == attempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.nextLine().toLowerCase();
            playAgain = playAgainResponse.equals("yes") || playAgainResponse.equals("y");
        }
        
        System.out.println("Game Over! Your final score: " + score);
        scanner.close();
    }
}


	