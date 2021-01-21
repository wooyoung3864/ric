package codehs;

public class NumberTriangle
{
    public static void main(String[] args)
    {
        // Call makeNumberTriangle
        makeNumberTriangleWithNumbers();
        makeReversedNumberTriangleWithStars();
    }

    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangleWithNumbers()
    {
        // Your code goes here!
        int treeSize = 5;
        for(int i = 1; i <= treeSize; ++i) {
            for(int j = 1; j <= treeSize - 1; ++j) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; ++k) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void makeReversedNumberTriangleWithStars() {
        int size = 10;
        for(int i = size; i >= 1; --i) {
            for(int j = i; j >= 1; --j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

