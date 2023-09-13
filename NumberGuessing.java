package Aarti;
import java.util.Random;
import java.util.Scanner;


public class NumberGuessing {

	public static void main(String[] args) {
		int ans, guess, i;
		int no = 1+(int) (100* Math.random());
		final int max = 100;
		int k = 5;
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		boolean correct = false;
		ans = random.nextInt(max) +1;
		while(!correct)
		{
			System.out.println("A number is Chosen" + "between 1 to 100"+ "Guess the number" + "within 5 trials");
			for(i=0; i<k; i++)
			{
				System.out.println("Guess The Number");
				guess = in.nextInt();
				if(ans == guess) {
					System.out.println("Congratulations!, You guess the correct one");
				}
				else if(guess > ans
						&& i != k -1)
				{
					System.out.println("Sorry Your guess is too high, Please try agian");
				}
				else if(guess < ans
						&& i !=k - 1)
				{
					System.out.println("Sorry your guess is too low, Please try agian");
				}
				
				else
				{
					System.out.println("You have exhausted" + " k trials");
					System.out.println("The number was" + ans);
				
				}
			}
			
		}
		System.exit(0);
	


	}

}
