package Aarti;
		import java.util.Scanner;
		import java.util.Random;

		public class GuessNumber2 {
		    
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Random rn = new Random();

		        int Limits = 5; 
		        int HidenNumber = rn.nextInt(100) + 1; 
		        int attempts = 0;

		        System.out.println("Welcome to the Number Guessing Game!");
		        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

		        while (attempts < Limits) {
		            System.out.print("Enter your guess: ");
		            int userGuess = sc.nextInt();
		            attempts++;

		            if (userGuess == HidenNumber) {
		                System.out.println("Congratulations! You guessed the number: " + HidenNumber);
		                break; 
		            } else if (userGuess < HidenNumber) {
		                System.out.println("Try a higher number.");
		            } else {
		                System.out.println("Try a lower number.");
		            }
		            
		            int remainingAttempts = Limits - attempts;
		            if (remainingAttempts > 0) {
		                System.out.println("You have " + remainingAttempts + " attempts remaining.");
		            } else {
		                System.out.println("Sorry, you've used all your attempts. The correct number was: " + HidenNumber);
		            }
		        }

		        sc.close();
		   }
}

