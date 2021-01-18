package classwork;

public class StringCheese {
	public static void main(String[] args) {
		String str2 = new String("The CSA Exam is May 6th.");
		String str4 = new String(str2);
		
		System.out.println(str2.length()); // =24
		System.out.println(str2.indexOf("am")); // =10
		System.out.println(str2.indexOf("a", 2)); // = 17
		System.out.println(str2.substring(4,7)); // = "CSA"
		System.out.println(str2.substring(16)); // = "May 6th"
		System.out.println(str2.equals(str4)); // true, different objects but contents are the same
		System.out.println(str2.compareTo(str4)); // =0
	}
		
}
