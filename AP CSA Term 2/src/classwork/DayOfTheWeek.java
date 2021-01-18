package classwork;
import java.util.Scanner;
public class DayOfTheWeek {
	public static final Scanner in = new Scanner(System.in);
	public static String day = "Sunday";
	
	public static void main(String[] args)
	{
		System.out.println("Enter your birth month: ");
		int m  = in.nextInt();
		System.out.println("Enter your birth day: ");
		int d = in.nextInt();
		System.out.println("Enter your birth year: ");
		int y = in.nextInt();
		System.out.println(dayOfWeek(m,d,y));
	}
	
	public static String dayOfWeek(int m, int d, int y)
	{
		int y0 = y-(14-m)/12;
		int x0 = y0 + (y0/4) - (y0/100) + (y0/400);
		int m0 = m+12*((14-m)/12)-2;
		int D = (d + x0 + 31 * (m0/12)) % 7;
		
		if(d == 1) {
			day = "Monday";
		} else if(d == 2) {
			day = "Tuesday";
		} else if(d == 3) {
			day = "Wednesday";
		} else if(d == 4) {
			day = "Thursday";
		} else if(d == 5) {
			day = "Friday";
		} else {
			day = "Saturday";
		}
		
		return "You were born on a " + day;
	}
}
