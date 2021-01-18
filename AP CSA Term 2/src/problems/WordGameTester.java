package problems;

import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word: ");
         String word = in.nextLine();
        // Scramble it
        // Print out scrambled word
         WordGames wg = new WordGames(word);
         System.out.println(wg);
         System.out.println(wg.scramble());
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = in.nextInt();
        in.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String anotherWord = in.nextLine();
        
        // Add random word at index
        String randomWord = wg.bananaSplit(idx,  anotherWord);
        // Print out the word
        System.out.println(randomWord);
        
        
        // Ask for a character (store as a String)
        System.out.println("Enter a character: ");
        String addToAnotherAnotherWord = in.nextLine();
        // Ask for random word
        System.out.println("Enter another another word: ");
        String anotherAnotherWord  = in.nextLine();
        // Add random word at character
        String result = wg.bananaSplit(addToAnotherAnotherWord, anotherAnotherWord);
        // Print out the word
        System.out.println(result);
        
        in.close();
        
    }
}
