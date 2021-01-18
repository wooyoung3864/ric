package classwork;
import java.util.Scanner;
public class PasswordGenerator {
	public static int alphabetPassword(int digits)
	{
		int password;
		password = (int) Math.random();
		return password;
	}
	public String randomAlphabets(int numLetters)
	{
		//String[] alphabets = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		char[] pw = new char[numLetters];
		for(int i = 0; i <= numLetters; ++i) {
			pw[i] = ((char)('A' + Math.random() * 27));
		}
		String randomPw = new String(pw);
		return randomPw;
	}
	public static void main(String[] args) {
        String password = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of digits:");
        int digits = in.nextInt();

        System.out.println(genPass(digits));
    }
    
    public static String genPass(int digits){
        String password = "";

        for (int i = 0; i < digits; i++) {
            int b = (int)(Math.random()*9);
            password += String.valueOf(b);
        }

        return password;
    }
}
