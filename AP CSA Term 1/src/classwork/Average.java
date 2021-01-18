package classwork;
import java.util.Scanner;
public class Average {
	public static void main(String[]args)
	{
		double val1, val2, val3;
		double average;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the values and " + "I will compute their average");
		val1 = in.nextDouble();
		val2 = in.nextDouble();
		val3 = in.nextDouble();
		in.close();
		average = (val1 + val2 + val3)/3;
		System.out.println("The average is: " + average);
	}
}
