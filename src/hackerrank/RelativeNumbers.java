package hackerrank;

import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Ask for two numbers
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        // Compare the numbers as instructed
        boolean less = (a < b);
        boolean equals = (a == b);
        boolean greater = (a > b);
        // Display the resultsr
        System.out.println(a + " < " + b + ": " + less);
        System.out.println(a + " = " + b + ": " + equals);
        System.out.println(a + " > " + b + ": " + greater);
    }
}

