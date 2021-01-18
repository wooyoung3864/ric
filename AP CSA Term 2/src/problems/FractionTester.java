package problems;

import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner in = new Scanner(System.in);
        
        // Ask for input
        System.out.println("Enter the numerator: ");
        int numer = in.nextInt();
        
        System.out.println("Enter the denominator: ");
        int denom = in.nextInt();
        
        // Create a new Fraction with the user's input
        Fraction oneHalf = new Fraction(1, 2);
        Fraction frac = new Fraction(numer, denom);
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int a = oneHalf.getNumerator();
        int b = oneHalf.getDenominator();
        int c = frac.getNumerator();
        int d = frac.getDenominator();
        
        // a/b + c/d = (a*d + b*c)/(b*d)
        int sumNumer = a*d + b*c;
        int sumDenom = b*d;
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        // 1/2 + 2/3 = 7/6
        Fraction sum = new Fraction(sumNumer, sumDenom);
        String sumEq = a + "/" + b  + " + " + c + "/" + d + " = ";
        System.out.println(sumEq + sum);
        
        in.close();
    }
}
