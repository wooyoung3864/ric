package bellwork;
import java.util.Scanner;
public class BellWork4 {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			
			System.out.println("Welcome to chinese restaurant!");
			System.out.println("How much did dinner cost?");
			double dinnerCost = in.nextDouble();
			
			
			System.out.println("How much was bat soup for one person?");
			double batSoup = in.nextDouble();
			
			System.out.println("How much was COVID-19?");
			double covid = in.nextDouble();
			
			System.out.println("How much did fried dog cost?");
			double dog = in.nextDouble();
			
			System.out.println("Price of Bat Soup: " + batSoup);
			System.out.println("Price of COVID-19: " + covid);
			System.out.println("Price of Fried Dog" + dog);
			
			double total = dinnerCost + batSoup + covid + dog;
			System.out.println("The total cost is: " + total);
			
			in.close();
		}
}
