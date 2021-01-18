package hackerrank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if(a == null || b == null || a.equals("") || b.equals("")) {
            throw new IllegalArgumentException();
        }
        
        if(a.length() != b.length()) {
            return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int k = 0; k <b.length(); ++k) {
        	char letter = b.charAt(k);
        	
        	if(! map.containsKey(letter)) {
        		map.put(letter, 1);
        	} else {
        		Integer frequency = map.get(letter);
        		map.put(letter, ++frequency);
        	}
        }
        
        for(int k = 0; k < a.length(); ++k) {
        	char letter = a.charAt(k);
        	
        	if(! map.containsKey(letter)) {
        		return false;
        	}
        	
        	Integer frequency = map.get(letter);
        	
        	if(frequency == 0) {
        		return false;
        	} else {
        		map.put(letter, --frequency);
        	}
        }
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

