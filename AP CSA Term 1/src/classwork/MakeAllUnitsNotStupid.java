package classwork;
import java.util.Scanner;
public class MakeAllUnitsNotStupid {
		public static void main(String[] args)
		{
			double val;	
			double result;
			
			System.out.println("Choose a unit to convert: \n1. Fahrenheit to Celsius \n2. Miles to kilometers \n3. Pounds to kilograms");
			
			Scanner in = new Scanner(System.in);
			int unit = in.nextInt();
			
			System.out.println("Enter a value:");
			
			val = in.nextDouble();
			
			System.out.println();
			
			in.close();
			
			if(unit == 1)
			{
				result = ((val - 32)*5)/9;
				System.out.println(val + "˚F  = " + (double)Math.round(result * 100d) / 100 + "˚C");
			}
			else if(unit == 2)
			{
				result = 1.60935 * val;
				System.out.println(val + " miles = " + (double)Math.round(result*1000d)/1000 + " kilometers");
			}
			else if(unit == 3)
			{
				result = 0.453592*val;
				System.out.println(val  + " pounds = " + (double)Math.round(result*10d)/10 + " kilograms");
			}
			else
			{
				throw new ArithmeticException("Not an option");
			}	
		}
}