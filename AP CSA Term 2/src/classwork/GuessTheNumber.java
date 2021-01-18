package classwork;
import java.util.Scanner;
public class GuessTheNumber {
	public static void guessTheNumber(int guess)
	{
		int password = 1+ (int)Math.random()*20;
		
		final int n = 5;
		
		System.out.println("Welcome to Guess The Number!");
		
		for(int i = 0 ; i < n; ++i)
			{
				System.out.println("Enter a number: ");
				if(guess == password)
				{
					System.out.println("Correct!");
					break;
				} else if(guess > password)
				{
					System.out.println("Lower!");
				} else if(guess < password)
				{
					System.out.println("Higher!");
				}
				
				if(i == n)
				{
					System.out.println("Game over!");
					break;
				}
			}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		guessTheNumber(in.nextInt());
		in.close();
	}
}
