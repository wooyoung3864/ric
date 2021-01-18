package random;
import java.util.Scanner;
public class NiceNumber {
	public static void main(String[] args)
	{
		Scanner nice = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long Nice = nice.nextLong();
		nice.close();
		if(Nice == 69 || Nice == 420 || Nice == 6969 || Nice == 42069 || Nice == 69420 || Nice == 4206942069L || Nice == 6942069420L)
		{
			System.out.println("Nice!");
			
		}
		else 
		{
			throw new ArithmeticException("Not Nice :(");
		}
	}
}
