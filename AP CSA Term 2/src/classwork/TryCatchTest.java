package classwork;
import java.util.Scanner;
public class TryCatchTest {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Say something: ");
		String s = in.nextLine();
		try {
			if (s.contains("a"))
		     {
		         System.out.println(s + " contains an a");
		     } else {
		    	 System.out.println(s + " does not contain an a");
		     }
		} catch(Exception e) {
			System.out.println("Does not contain an \"a\"");
		} finally {
			in.close();
		}
	}
}
