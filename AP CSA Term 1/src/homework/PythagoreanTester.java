package homework;
import java.util.Scanner;
public class PythagoreanTester {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			Pythagorean solve = new Pythagorean();
			System.out.println("Welcome to Pythagorean solver!" + "\nChoose a side to find: " + "\n1. Hypotenuse" + "\n2. Side length");
			int side = in.nextInt();
			
			System.out.println("Enter length of side 1: ");
			double sideOne = in.nextDouble();
			
			System.out.println("Enter length of side 2: ");
			double sideTwo = in.nextDouble();
			
			
			
			
		}
}
