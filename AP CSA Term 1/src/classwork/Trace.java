package classwork;
import java.util.Scanner;
public class Trace {
	public static void main(String[] args)
	{
		int one, two, three;
		double what;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter two integers: ");
		System.out.println(" ");
		one = scan.nextInt();
		
		two = scan.nextInt();

		System.out.println(" ");
		
		
		System.out.print("Enter a floating point number: ");
		what = scan.nextDouble();
		
		scan.close();
		
		three = 4 * one + 5 * two;
		two = 2* one;
		System.out.println ("one " + two + ":" + three);
		
		one = 46 / 5 * 2 + 19 % 4;
		System.out.println(one);
		System.out.println(two);
		three = one + two;
		System.out.println(three);
		what = (what + 2.5) / 2;
		System.out.println (what + " is what!");
	}
}

