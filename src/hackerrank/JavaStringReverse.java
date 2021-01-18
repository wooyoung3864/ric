package hackerrank;
import java.util.Scanner;
import java.lang.StringBuilder;

public class JavaStringReverse {
	public static final Scanner  in  = new Scanner(System.in);
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		String str = in.nextLine();
		sb.append(str);
		sb = sb.reverse();
		String str2  = sb.toString();
		boolean rev = str.equalsIgnoreCase(str2);
		System.out.println( (rev) ? "Yes" : "No");
		
	}
}


