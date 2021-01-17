package codehs;
import java.util.Scanner;
public class findCharTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String key = in.nextLine();
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + findChar(word, key));
    }

    public static boolean findChar(String string, String key)
    {
        return string.contains(key);
    }
}


