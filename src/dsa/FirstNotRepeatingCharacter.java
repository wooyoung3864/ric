package dsa;
import java.util.Scanner;
import java.util.HashMap;
public class FirstNotRepeatingCharacter {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		String s = in.nextLine();
		System.out.println("The first non-repeating character is " + firstNotRepeatingCharacter(s));
		System.out.println("The first non-repeating character is " + firstNotRepeatingHashMapCharacter(s));
	}
	
	public static char firstNotRepeatingCharacter(String s) {
		for(int i = 0; i < s.length(); ++i) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		return '_';
	}
	
	public static char firstNotRepeatingHashMapCharacter(String s) {
		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if(charCounts.containsKey(c)) {
				charCounts.put(c, charCounts.get(c) + 1);
			} else {
				charCounts.put(c,  1);
			}
		}
		
		for(int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if(charCounts.get(c) == 1) return c;
		}
		
		return '_';
	}
}

