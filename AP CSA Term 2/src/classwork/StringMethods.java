package classwork;
import java.util.Arrays;
import java.util.Scanner;
public class StringMethods {
	public static void main(String[] args)
	{
        System.out.println("Enter an expression: ");
        //User inputs an expression containing a double and an operator
        Scanner in = new Scanner(System.in);
        //Stores input as a String object
        String input = in.nextLine();
        //String is split into numbers and operators and is stored as an array. 
        String[] split = input.split("(?<=[\\d.])(?=[^\\d.])|(?<=[^\\d.])(?=[\\d.])");
        //Displays user input
        System.out.println("Your input: " + input);
        System.out.println(Arrays.toString(split));
        
        System.out.println();
        
        String akumpo = "Giannis Antetokounmpo";
        System.out.println(akumpo.replace("n", "m"));
	}
}
