package classwork;
import java.util.Scanner;
public class PasswordGeneratorTester {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		PasswordGenerator gen = new PasswordGenerator();
		int numDigits = in.nextInt();
		System.out.println(gen.alphabetPassword(5));
		in.close();
	}
}
