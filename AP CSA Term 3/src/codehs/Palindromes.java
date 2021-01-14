package codehs;

import java.util.Scanner;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        // Create user input and let user know whether their word is a palindrome or not!
        System.out.println("Say something: ");
        String text = in.nextLine();
        System.out.println("Is a palindrome: " + isPalindrome(text));

    }

    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     *
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        String reverse = reverse(text);
        return text.equals(reverse);
    }

    /**
     * This method reverses a String.
     *
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(text.toLowerCase());
        sb = sb.reverse();
        String reverse = sb.toString();
        return reverse;
    }

}


