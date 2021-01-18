package problems;
import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        System.out.println("Enter player one's name: ");
        String p1 = in.nextLine();
        System.out.println("Enter player two's name: ");
        String p2 = in.nextLine();
        
        System.out.println("Enter " + p1 + "'s score");
        int s1 = in.nextInt();
        System.out.println("Enter " + p2 + "'s score");
        int s2 = in.nextInt();
        
        int order = p1.compareTo(p2);
        if(order < 0) {
        	System.out.println(p1 + " scored " + s1 + " points");
        	System.out.println(p2 + " scored " + s2 + " points");
        } else if(order > 0) {
        	System.out.println(p2 + " scored " + s2 + " points");
        	System.out.println(p1 + " scored " + s1 + " points");
        }
        
        if(s1 > s2) {
        	System.out.println(p1 + " wins!");
        } else {
        	System.out.println(p2 + " wins!");
        }
    }
}

/*
Write a program that asks for the name and number of points scored by two basketball players.

Print out the player’s scores in alphabetical order according to the player’s names. Use the String method compareTo. Refer to the DOCS if you’ve forgotten how to use it, or to the JavaDocs here: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

Then print which player scored more points.

Here is some example output:

Enter player one's name: 
Tracy
Enter player two's name: 
Karel
Enter Tracy's score
13
Enter Karel's score
20
Karel scored 20 points
Tracy scored 13 points
Karel wins!
*/