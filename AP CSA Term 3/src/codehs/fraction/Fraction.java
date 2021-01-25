package codehs.fraction;

public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;

    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }

    // Returns the numerator
    public int getNumerator()
    {
        return numerator;
    }

    // Returns the denominator
    public int getDenominator()
    {
        return denominator;
    }

    public void setNumerator(int x) {
        numerator = x;
    }


    public void setDenominator(int x) {
        denominator = x;
    }

    public void add(Fraction other) {
        numerator = (numerator * other.denominator) + (other.numerator * denominator);
        denominator *= other.denominator;
    }

    public void subtract(Fraction other) {
        numerator = (numerator * other.denominator) - (other.numerator * denominator);
        denominator *= other.denominator;
    }

    public void multiply(Fraction other) {
        numerator *= other.numerator;
        denominator *= other.denominator;
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }
}

