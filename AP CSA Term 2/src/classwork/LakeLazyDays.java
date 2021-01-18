package classwork;
import java.util.Scanner;

public class LakeLazyDays {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Lake LazyDays Resort!" + "\nEnter the temperature: ");
		int temp = in.nextInt();
		
		
		if(temp >= 95 || temp <= 20) {
			System.out.println("Visit our shops!");
		} else if(temp >= 60) {
			System.out.println("Go swimming!");
		} else if(temp >= 40 && temp < 60) {
			System.out.println("Go play tennis!");
		} else if(temp < 40) {
			System.out.println("Go skiing!");
		} else {
			System.out.println("Go home!");
		}
		in.close();
	}
}
