package problems;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double payment = in.nextDouble();
		
		Locale ind = new Locale("en", "IN");
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat india = NumberFormat.getCurrencyInstance(Locale.CHINA);
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
		in.close();
	}
}
