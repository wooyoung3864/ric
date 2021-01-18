package classwork;
import java.util.Scanner;
public class Casting {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter movie rating as a decimal: ");
			double rating = in.nextDouble();
			in.close();
			
			rating += 0.5;
			System.out.println("Rating rounded: ");
			System.out.println((int) rating);
			
		}
}
