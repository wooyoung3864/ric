package classwork;
import java.util.Scanner;
public class IfDemo {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean appAccepted;
		System.out.println("Enter your GPA: ");
		double gpa = in.nextDouble();
		if(gpa >= 3.0) {
			appAccepted = true;
		} else {
			appAccepted = false;
		}
		System.out.println(appAccepted);
		
		if(appAccepted == true)
		{
			System.out.println("Welcome to Clown College!");
		} else {
			System.out.println("Go back to McDonalds!");
		}
	}
}