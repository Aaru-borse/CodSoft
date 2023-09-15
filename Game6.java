package Aarti;
import java.util.Scanner;
import java.util.Random;
public class Game6 {
	public static void main(String [] args) {
		

	 System.out.println("Pick a number between 1-100");

	    Scanner keyboard = new Scanner(System.in);
	    Random rand = new Random();
	    int number = rand.nextInt(100)+1;
	    int round = 0;
	    int count = 0;
	    int guess = 0;
	    int win = 0;

	    while(win == 0)
	    {
	        round++;
	        System.out.println("Round " + round);

	        System.out.print("What is your first guess? ");
	        guess = keyboard.nextInt();
	        count++;

	        if (guess == number)
	        {
	            if (count == 1)
	            {
	                System.out.println("You win in " + count + " guess.");
	                ++win;
	                break;
	            }
	        }
	        else if (guess > number)
	        {
	            System.out.println("That's too high. Try again: ");
	        }
	        else if (guess < number)
	        {
	            System.out.println("That's too low. Try again: ");
	        }

	    }


	    //Ask to play again
	    boolean isValidAnswer;
	    do
	    {
	        System.out.print("Would you like to play again (yes/no)? ");
	        String playAgain = keyboard.next().toUpperCase();
	        isValidAnswer= playAgain.equals("YES") || playAgain.equals("NO");
	        if(! isValidAnswer)
	        {
	            System.out.println("Error: Please enter yes or no");
	            System.out.println();
	        }
	    }while(!isValidAnswer);
	}
	}