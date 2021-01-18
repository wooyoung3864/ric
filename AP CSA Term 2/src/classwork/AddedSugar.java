package classwork;
import java.util.Scanner;
public class AddedSugar {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is your gender?" + "\n1. Male" + "\n2. Female");
		System.out.println();
		int gender = in.nextInt();
		System.out.println();
		System.out.println("How many grams of sugar have you eaten today?");
		int amtSugar = in.nextInt();
		boolean canEatMoreSugar = true;
		
		if(gender == 1)
		{
			if(amtSugar > 36)
			{
				canEatMoreSugar = false;
			}
		} else if(gender == 2)
		{
			if(amtSugar > 25)
			{
				canEatMoreSugar = false;
			}
		}
		System.out.println("You can eat more sugar: " + canEatMoreSugar);
		
	}
}
