package problems;
import java.util.Scanner;

public class AssertionDemo {
	public static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the dividend: ");
		int x = in.nextInt();
		System.out.println("Enter the divisor: ");
		int y = in.nextInt();
		System.out.println(divide(x,y));
	}
	
	public static double divide(int x, int y) {
		assert y != 0 : "Cannot divide by zero!";
		return Math.round((x / y) * 100) /100.0;
	}
}
