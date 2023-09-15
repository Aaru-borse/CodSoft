package Aarti;


import java.util.Scanner;

public class GuessingGame7 {

	
	    private int attempts; // Number of attempts taken
	    private int roundsWon; // Number of rounds won
	    private int score; // User's score
	    
	    public GuessingGame7() {
	        this.attempts = 0;
	        this.roundsWon = 0;
	        this.score = 0;
	    }
	    
	    // Increment attempts and update the score
	    public void incrementAttempts() {
	        attempts++;
	        calculateScore();
	    }
	    
	    // Increment roundsWon and update the score
	    public void incrementRoundsWon() {
	        roundsWon++;
	        calculateScore();
	    }
	    
	    // Calculate the score based on your scoring logic
	    private void calculateScore() {
	        // You can define your own scoring logic here
	        // For example, you can give more weight to rounds won
	        score = roundsWon * 10 - attempts;
	    }
	    
	    // Display the user's score
	    public void displayScore() {
	        System.out.println("User's Score:");
	        System.out.println("Attempts: " + attempts);
	        System.out.println("Rounds Won: " + roundsWon);
	        System.out.println("Total Score: " + score);
	    }
	    
	    public static void main(String[] args) {
	        GuessingGame7 calculator = new GuessingGame7();
	        
	        // Simulate some game interactions
	        calculator.incrementAttempts();
	        calculator.incrementRoundsWon();
	        calculator.incrementAttempts();
	        calculator.incrementAttempts();
	        calculator.incrementRoundsWon();
	        
	        // Display the user's score
	        calculator.displayScore();
	    }
	}
