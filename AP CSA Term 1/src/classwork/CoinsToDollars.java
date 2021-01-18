package classwork;
import java.util.Scanner;
public class CoinsToDollars {
	public static void main(String[] args)
	{
		int q, d, n, p;
		double quarters, dimes, nickels, pennies, dollars;
		double conversionFactor;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Number of quarters: ");
		q = in.nextInt();
		conversionFactor = 0.25;
		quarters = (double) q * conversionFactor;
		
		System.out.println("Number of dimes: ");
		d = in.nextInt();
		conversionFactor = 0.1;
		dimes = (double) d * conversionFactor;
		
		System.out.println("Number of nickels: ");
		n = in.nextInt();
		conversionFactor = 0.05;
		nickels = (double) n * conversionFactor;
		
		System.out.println("Number of pennies: ");
		p = in.nextInt();
		conversionFactor = 0.01;
		pennies = (double) p * conversionFactor;
		
		in.close();
		
		dollars = quarters + dimes + nickels + pennies;
		
		System.out.println("Amount in dollars: $" + (double)Math.round(dollars * 100d) / 100);
	}
}
