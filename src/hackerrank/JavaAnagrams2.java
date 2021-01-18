package hackerrank;
import java.util.Scanner;
public class JavaAnagrams2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String a = in.nextLine();
		String b = in.nextLine();
		boolean ret = isAnagram(a,b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams");
	}
	
	public static boolean isAnagram(String a, String b) {
		if(a == null || b == null || a.equals("") || b.equals("")) {
			throw new IllegalArgumentException();
		}
		
		if(a.length() != b.length()) {
			return false;
		}
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		int sum = 0;
		
		for(char c = 'a'; c <= 'z'; ++c) {
			for(int i  = 0; i < a.length(); ++i) {
				if(a.charAt(i) == c) {
					++sum;
				}
				if(b.charAt(i) == c) {
					--sum;
				}
			}
			if(sum != 0) {
				return false;
			}
		}
		return true;
	}
}
