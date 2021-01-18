package classwork;

public class FindMinimum {
	public static void main(String[] args)
	{
		int min = 0;
		int a = 7;
		int b = 6;
		int c = 10;
		
		if(a < b && a < c) {
			min = a;
		} else if(b < a && b < c) {
			min = b;
		} else if(c < a && c < b) {
			min = c;
		}
	
		System.out.println("The minimum value is : " + min);
	}
}
