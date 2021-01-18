package classwork;

public class BoolZen {
		public static boolean bothOdd(int n1, int n2, int n3)
		{
			return(n1 % 2 != 0 && n2 %2 != 0);
		}
		
		public static void main(String[] args)
		{
			System.out.println(BoolZen.bothOdd(69, 420, 69420));
		}
}
