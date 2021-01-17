package codehs;

public class TreeOfStars
{
    public static void main(String[] args)
    {
        // Call makeATree
        makeATree();
    }
    public static void makeATree()
    {
        int numRows = 9;
        for(int i = 1; i <= numRows; ++i) {
            int numSpaces = numRows - i;
            System.out.print("  ");
            for(int j = 1; j <= numSpaces; ++j) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; ++k) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *
 */

