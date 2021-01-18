package projects;
    import java.util.Scanner;
    import java.util.Arrays;
    public class Calculator
    {
        public static void main(String[]args)
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
            /*
            for(int i = 0; i < split.length; i++){
                num = split[i];
                ans += Integer.toString(ans); 
            }
            */
        }
}
/*
 * 1. 
 * 2. Store expression in a String[] object
 * 3. Use while(true) loop to keep requesting for user input. Break when user input is null
 * 4. Use split and regex function to separate the numbers from operators
 * 5. 
 * 6. 
 * 7. 
 */