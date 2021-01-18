package classwork;
import java.util.Scanner;
public class RollerCoaster {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is your age? ");
		int age = in.nextInt();
		System.out.println("What is your height?");
		int height = in.nextInt();
		
		boolean canRide = height >= 42 && age >= 9;
		String ride;
		
		if(canRide == true) {
			ride = "Welcome aboard!";
		} else if(age <= 10 && height >= 170) {
				ride  = "Akumpo you're literally 14'5\"!";
			} else {
			ride = "go home kid";
		}
		
		System.out.println(ride);

	}
}
