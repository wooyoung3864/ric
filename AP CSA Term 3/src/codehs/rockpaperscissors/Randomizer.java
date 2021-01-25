package codehs.rockpaperscissors;

public class Randomizer
{
    public static int nextInt()
    {
        return (int) (Math.random() * 10 + 1);
    }

    public static int nextInt(int min, int max)
    {
        int range = max - min;
        return (int) (Math.random() * (range + 1) + min);
    }
}
