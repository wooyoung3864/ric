package codehs;
import java.util.Scanner;
public class Grammar
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(useProperGrammar(word));
    }
    public static String useProperGrammar(String word)
    {
        String newWord = "";
        Integer twoCount = 0;
        for(int i = 0; i < word.length(); ++i) {
            String part = word.substring(i, i+1);
            if(part.equals("2")) {
                newWord += "to";
                ++twoCount;
            } else {
                newWord += part;
            }
        }
        String count = twoCount.toString();
        if(twoCount == 1) {
            return "Fixed " + count + " grammatical error: " + "\n" + newWord;
        }
        return "Fixed " + count + " grammatical errors: " + "\n" + newWord;
    }
}