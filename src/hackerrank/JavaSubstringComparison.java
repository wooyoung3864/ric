package hackerrank;
import java.util.Scanner;
public class JavaSubstringComparison {
	public static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Say something: ");
		String str = in.nextLine();
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		System.out.println(getSmallestAndLargest(str, n));
	}
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = "";
		
		for(int i = 0; i < s.length()-k+1; ++i) {
			if(s.substring(i, i+k).compareTo(smallest) < 0) {
				smallest = s.substring(i, i+k);
			}
			if(s.substring(i, i+k).compareTo(largest) > 0) {
				largest = s.substring(i, i+k);
			}
		}
		
		return smallest + "\n" + largest;
	}
}
