package classwork;
import java.util.Scanner;
public class Water {
	public static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("When was the last time you watered your plants (in days)? ");
		int daysWatered = in.nextInt();
		
		System.out.println("Is the soil moist? (yes/no) ");
		String moist = in.next();
		boolean isMoist = moist.equals("yes");
		System.out.println();
		System.out.println("Need to water plants: " + canWaterPlants(daysWatered, isMoist));
	}
	
	public static boolean canWaterPlants(int daysWatered, boolean isMoist)
	{
		boolean needsWater = !isMoist && daysWatered >= 10;
		return needsWater;
	}
}
