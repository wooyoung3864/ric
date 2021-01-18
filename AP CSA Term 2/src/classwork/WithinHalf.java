package classwork;

public class WithinHalf {
	public static void main(String[] args)
	{
		System.out.println(WithinHalf.withinHalf(6.9, 7.4));
		System.out.println(WithinHalf.withinHalf(4.2, 6.9));
	}
	public static boolean withinHalf(double a, double b)
	{
		return Math.abs(a-b) <= .5;
	}
}
