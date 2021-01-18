package classwork;
import java.util.Scanner;
public class AgeCounter {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter yo age: ");
			int age = in.nextInt();
			
			System.out.println("My current age is: " + age);
			System.out.println("My age next year will be: " + age++);
			System.out.println("My current age is: " + age--);
			
			in.close();

		}
}
