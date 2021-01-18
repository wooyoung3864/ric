package projects;
import java.util.*;
public class GFG1 {
	public static void main(String[] args)
		throws Exception
	{
		try {
			
			// gets the string
			String s = "Ric has Scanner Class Methods";
			
			// creates a new scanner
			// with the specified String object
			Scanner scanner = new Scanner(s);
			
			// prints the next line of the string
			System.out.println("Scanner: " + scanner.nextLine());
			
			// closes the scanner
			scanner.close();
			
			System.out.println("\nScnaner Closed.\n");
			
			System.out.println("Trying to use scanner" + " after closing.");
			
			// prints the next line of the string
			System.out.println(scanner.nextLine());
		}
		
		catch (Exception e) {
			System.out.println("Exception thrown:\n" + e);
		}
	}
}
