package classwork;

public class Odds
{
	public static void main (String[] args)
	{
		printOdds(3);
		printOdds(17 /2);
		
		int x =25;
		printOdds(37 - x + 1);
	}
	
	public static void printOdds(int n)
	{
		for(int i = 1; i <= n; ++i)
		{
			int odd = 2 * i -1;
			System.out.print(odd + " ");;
		}
		System.out.println();
	}
}
