package classwork;

public class ComparingStrings {
	public static void main(String[] args)
	{
		String s1 = "HOT", s2 = "HOTEL", s3 = "dog";
		String s4 = "hot";
		String s5  = new String("hot");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s4.compareTo(s3));
		System.out.println(s4.compareTo(s5));
		
	}
}
