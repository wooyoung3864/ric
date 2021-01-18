package classwork;
import java.util.Scanner;
public class CompoundExpressions {
	public static boolean needGlasses;
	public static boolean heatOn;
	public static boolean canDrink;
	public static boolean paidRent;
	public static final Scanner in = new Scanner(System.in);
	
	public static void glasses()
	{
		System.out.println("Enter your age: ");
		int age = in.nextInt();
		
		System.out.println("Enter your eyesight: ");
		int eyesight = in.nextInt();
		
		needGlasses = eyesight != 20 || age > 60;
		
		System.out.println("You need glasses: " + needGlasses);
	}
	
	public static void heat()
	{
		System.out.println();
		System.out.println("What is the temperature? ");
		int temp = in.nextInt();
		
		System.out.println("Have you paid rent? (yes/no) ");
		String rent = in.next();
		
		boolean heatOn = temp < 65 && rent.equals("yes");
		
		System.out.println("Is the heat on? " + heatOn);
	}
	
	public static void drink()
	{
		System.out.println();
		System.out.println("Enter your age: ");
		int age = in.nextInt();
		System.out.println("Did mommy give you permission? (yes/no)");
		String permission = in.next();
		System.out.println("Did you have a drink today? (yes/no)");
		String drink = in.next();
		
		boolean canDrink = (permission.equals("yes") && drink.equals("no")) || age >= 18;
		
		System.out.println("Can you drink? " + canDrink);
	}
	public static void main(String[] args)
	{			
			glasses();
			heat();
			drink();
			in.close();
	}
}
