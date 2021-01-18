package classwork;
public class StringExample {
	public static void main(String[] args)
	{
		String s1 = new String("2.6 String Objects");
		
		String s2 = "This is a literal.";
		
		String s3 = new String(s1);
		String s4 = new String ((s1) + (s2));
		String s5 = new String();
		s5 = (s1) + " is" + (s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}
