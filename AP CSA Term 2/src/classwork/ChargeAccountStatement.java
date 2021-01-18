package classwork;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class ChargeAccountStatement {
	
	public static double minPay;
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your previous balance: ");
		double oldBal = in.nextDouble();
		System.out.println("Enter additional charges: ");
		double addCh = in.nextDouble();
		in.close();
		System.out.println();
		double totalOwed = oldBal + addCh;
		double interest = 0;
		if(oldBal != 0) {
			interest  = 0.02 * totalOwed;
		}
		
		double newBal = totalOwed + interest;
		
		if(newBal < 50) {
			minPay = newBal;
		} else if(newBal >= 50 && newBal <= 300) {
			minPay = 50.0;
		} else if(newBal > 300) {
			minPay = 0.2 * newBal;
		}
		
		NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println("RICCARD International Statement");
		System.out.println("=================================");
		System.out.println();
		System.out.println("Previous Balance: " + "\t" + money.format(oldBal));
		System.out.println("Additional Charges: " + "\t" + money.format(addCh));
		System.out.println("Interest: " + "\t\t" + money.format(interest));
		System.out.println();
		System.out.println("New Balance: " + "\t\t" + money.format(newBal));
		System.out.println();
		System.out.println("Minimum Payment: " + "\t" + money.format(minPay));
	}
}
