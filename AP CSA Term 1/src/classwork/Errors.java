package classwork;
import java.util.Scanner;
public class Errors {
	public static void main(String[] args)
	{
		String name;
		int number;
		int numSq;
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Enter your name, please: ");
		name = scan.nextLine();
		
		System.out.println("What is your favorite number? ");
		number = scan.nextInt();
		if (number == 69) 
		{
			System.out.println("Nice");
		}
		else if (number == 420){
			System.out.println("Very nice");
		}
		else if (number == 42069)
		{
			System.out.println("NICE");
		}
		else if (number == 69420)
		{
			System.out.println("VERY NICE");
		}
		else if (number == 6942069)
		{
			System.out.println("Long Boi GAng");
		}
		
		scan.close();
		
		numSq = number * number;
		
		System.out.println(name + ", the square of your number is " + numSq + ".");
	}
	
}
