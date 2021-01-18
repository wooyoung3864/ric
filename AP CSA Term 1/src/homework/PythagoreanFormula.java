package homework;
import java.util.Scanner;
public class PythagoreanFormula {
	public static void main(String[] args)
	{
			double sideThree;
			Scanner in = new Scanner(System.in);
		
			System.out.println("Welcome to Pythagorean solver!" + "\nChoose a side to find: " + "\n1. Hypotenuse" + "\n2. Side length");
			int side = in.nextInt();
		
			System.out.println("Enter length of side 1: ");
			double sideOne = in.nextDouble();
			
			System.out.println("Enter length of side 2: ");
			double sideTwo = in.nextDouble();
			
			sideOne = Math.pow(sideOne, 2);
			sideTwo = Math.pow(sideTwo, 2);
			
			if(side == 1)
			{
				sideThree = sideOne + sideTwo;
				sideThree = Math.sqrt(sideThree);
				System.out.println("Length of hypotenuse: " +Math.round (sideThree * 100d) / 100 + " units");
			}else if(side == 2)
			{
				sideThree = sideTwo - sideOne;
				sideThree = Math.sqrt(sideThree);
				System.out.println("Length of side: " + Math.round (sideThree * 100d) / 100 + " units");
			}
			
			in.close();	
	}
}
