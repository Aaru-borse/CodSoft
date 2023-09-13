package Aarti;
import java.util.Random;
import java.util.Scanner;

public class UserGuessNumber {

	public static void main(String[] args) {
	int Ans, Guess_no;
	final int max = 100;
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	boolean correct = false;
	Ans = random.nextInt(max) + 1;
	
	while(!correct)
	{
		System.out.println("Please Guess the number between range 1 to 100:");
		Guess_no = sc.nextInt();
		
		if(Guess_no > Ans)
		{
			System.out.println("Sorry Its Too High...., Please Try One More Time....");
			
		}
		else if(Guess_no < Ans)
		{
			System.out.println("Sorry Its Too Low...., Please Try One More Time....");
			
		}
		else {
			System.out.println("Congratulations...., You Guess The Correct one...");
			correct = true;
		}
	}
	System.exit(0);
	}

}
