package projects;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapForU {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Character, Integer> hey = new HashMap<Character, Integer>();
		System.out.println("say something ;) ");
		String you = in.nextLine();
		for(int i = 0; i < you.length(); ++i) {
			char me = you.charAt(i);
			if(me == 'u') {
				hey.put(me, 1);
				System.out.println("would u like to be the key to my hashmap?");
			} else { 
				System.out.println("nevermind lol");
			}
		}
	}
}
