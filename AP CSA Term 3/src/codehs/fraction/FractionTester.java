package codehs.fraction;

public class FractionTester
{
    public static void main(String[] args)
    {
        Fraction first = new Fraction(1, 2);
        Fraction second = new Fraction(1, 3);
        System.out.println();

        System.out.println("BEFORE:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        first.multiply(second);

        System.out.println("AFTER:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        Fraction third = new Fraction(6,9);
        Fraction fourth = new Fraction(4,7);
        System.out.println();

        System.out.println("BEFORE:");
        System.out.println("third: " + third);
        System.out.println("fourth: " + fourth);

        third.add(fourth);

        System.out.println("AFTER:");
        System.out.println("third: " + third);
        System.out.println("fourth: " + fourth);

        Fraction fifth = new Fraction(2,5);
        Fraction sixth = new Fraction(3,8);
        System.out.println();

        System.out.println("BEFORE:");
        System.out.println("fifth: " + fifth);
        System.out.println("sixth: " + sixth);

        fifth.subtract(sixth);

        System.out.println("AFTER:");
        System.out.println("fifth: " + fifth);
        System.out.println("sixth: " + sixth);
    }
}

