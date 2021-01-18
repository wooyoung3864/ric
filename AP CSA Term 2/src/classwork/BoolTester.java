package classwork;

public class BoolTester {
	public static void main(String[] args)
	{
		boolean a = false, b = true;
		boolean c  = (a && (b || !a)) == a && b;
		System.out.println(c);
	}
}
