package classwork;
import java.util.Scanner;
public class InputValues {
	public static void main(String[]args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = input.nextLine();
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		System.out.print("Enter your height (in cm to the nearest tenth) ");
		double height = input.nextDouble();
		
		input.close();
		
		System.out.println("Your name is " + name + ", you are " + age + " years old, and your height is " + height + " cm.");
		
		
			
	}

}
