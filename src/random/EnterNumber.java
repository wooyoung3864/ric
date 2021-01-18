package random;
import java.util.Scanner;
public final class EnterNumber {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a number: ");
			long number = in.nextLong();
			System.out.println("Your input: " + number);
			if(number == 6942069420L)
			{
				System.out.println("Nice");
				System.out.println("Long Boi GAng!");
			}
			in.close();
		}
}
