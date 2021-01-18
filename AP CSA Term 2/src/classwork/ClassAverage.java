package classwork;
import java.util.Scanner;
public class ClassAverage {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in how much money you made this week: ");
		int sum  = in.nextInt();
		
		System.out.println("Enter how many days you worked: ");
		int days = in.nextInt();
		
		if(days == 0)
		{
			System.out.println("You could be working more days.");
		} else if(sum / days > 50 && days != 0)
		{
			System.out.println("You're making a lot each day!");
		} else {
			System.out.println("You could be making more.");
		}
	}
}
